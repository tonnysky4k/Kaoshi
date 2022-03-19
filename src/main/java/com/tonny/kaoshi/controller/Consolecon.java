package com.tonny.kaoshi.controller;


import com.tonny.kaoshi.entity.*;
import com.tonny.kaoshi.service.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Consolecon {

    @Autowired
    KaotiService  kaotiService;
    @Autowired
    KaochjService kaochjService;
    @Autowired
    UserService userService;
    @Autowired
    AnsService ansService;
    @Autowired
    RenZService renZService;

    @Autowired
    RenKMService renKMService;

    @Autowired
    ShiJuanService shiJuanService;
    @Autowired
    UserRightService userRightService;
    
    User  g_user =null;

    @RequestMapping(value="/queryShjKaot",method=RequestMethod.GET)
    public String kaot(Long sid ,Model model)
    {
        List<KaoAns> kalist = new ArrayList<KaoAns>();
        List<Kaot> listk = kaotiService.selectBySid(sid);
        KmShijuan shij = shiJuanService.selectById(sid);
        model.addAttribute("shij",shij.getKmsj());
        Long tid =0L;
        for(int i=0;i<listk.size();i++)
        {
            tid ++;
            KaoAns ka = new KaoAns();
            Long id =listk.get(i).getId();
            ka.setId(tid);
            ka.setKaot(listk.get(i));
            ka.setDaaList(ansService.selectById(id));
            kalist.add(ka);
        }
        model.addAttribute("kas",kalist);
        return "Kaot2";

    }

    @RequestMapping(value="/user",method = RequestMethod.GET)
    public String getUserList(Model model)
    {
        List<User> users = userService.selectAll();
        List<UserAndRight> uars= new ArrayList<>();
        for(int i =0;i<users.size() ;i++)
        {
            User u = users.get(i);
            UserAndRight uar = new UserAndRight();
            uar.setUser(u);
            List<UserRight> userRights =userRightService.selectByUid(u.getId());
            uar.setRights(userRights);
            List<String> rens= new ArrayList<>();
            List<String> kms =new ArrayList<>();
            for(int j=0;j<userRights.size();j++)
            {
                UserRight ur = userRights.get(j);
                RenzKm km = renKMService.selectById(ur.getKmid());
                RenZheng rz =renZService.selectById(ur.getRzid());
                if(!rens.contains(rz.getRz_name()))
                    rens.add(rz.getRz_name());
                if(null !=km)
                    kms.add(km.getRzkm());
            }
            uar.setRens(rens);
            uar.setKms(kms);
            uars.add(uar);
        }
        model.addAttribute("uars",uars);
        return "UserList";

    }
    @RequestMapping("/userRight")
    public String userRightList(Long uid,Model model)
    {
        List<UserRight> urs = userRightService.selectByUid(uid);
        List<UserRight2> urs2 =new ArrayList<>();
        for(int i=0;i<urs.size();i++)
        {
            UserRight2 ur2 = new UserRight2();
            User u = userService.selectById(uid);
            ur2.setUname(u.getPho());
            RenZheng rz = renZService.selectById(urs.get(i).getRzid());
            ur2.setRname(rz.getRz_name());

            RenzKm km = renKMService.selectById(urs.get(i).getKmid());
            ur2.setKname(km.getRzkm());

            ur2.setId(urs.get(i).getId());
            urs2.add(ur2);
        }
        model.addAttribute("urs",urs2);
        model.addAttribute("uid",uid);
        return "UserRight";

    }
    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String login()
    {
        return "loginb";
    }

    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String index(HttpServletRequest req)
    {
        HttpSession session =req.getSession();
        User u =(User) session.getAttribute("user");
        if(null == u) return "loginb";
        g_user  = u;
        return "index";
    }
    @RequestMapping(value="/left")
    public String getKaoLeft(HttpServletRequest req,Model model)
    {
        HttpSession session =req.getSession();
        User u =(User) session.getAttribute("user");
        List<UserRight> userRights = userRightService.selectByUid(u.getId());
        List<RenZheng> renzs = renZService.selectAll();
        List<RenZheng> rzs = new ArrayList<>();
        if(u.getPho().equals("Admin"))
        {
            model.addAttribute("renzs",renzs);

        }else{
            for(int i=0;i<userRights.size();i++)
            {
                Long  rzid = userRights.get(i).getRzid();
                for(int j=0;j<renzs.size();j++ )
                    if(rzid == renzs.get(j).getId())
                        if(!rzs.contains(renzs.get(j)))
                            rzs.add(renzs.get(j));
            }
            model.addAttribute("renzs",rzs);
        }
        return "Left";

    }

    @RequestMapping(value="/top")
    public String getTop()
    {
        return "Top";
    }

    @RequestMapping(value="/main")
    public String getFrameMain(Long rid,Long kid,HttpServletRequest req,Model model)
    {
        List<RenzKm> kms = renKMService.selectByRid(rid);
        HttpSession session =req.getSession();
        User u =(User) session.getAttribute("user");
        List<UserRight> userRights = userRightService.selectByUid(u.getId());
        List<RenzKm> listKM = new ArrayList<>();
        if(u.getPho().equals("Admin"))
        {
            model.addAttribute("kms",kms);
            if(null == kid)
            {
                if(kms.size()>0)
                    kid =kms.get(0).getId();
            }
            List<KmShijuan> shijs = shiJuanService.selectByRid(kid);
            model.addAttribute("kmid",kid);
            model.addAttribute("rzid",rid);
            model.addAttribute("shijs",shijs);
            return "ShiJuanList";
        }
        else {
            for(int i =0;i<userRights.size();i++)
            {
                Long kmid =userRights.get(i).getKmid();
                for(int j= 0;j<kms.size();j++)
                    if(kms.get(j).getId() ==kmid)
                        if(!listKM.contains(kms.get(j)))
                            listKM.add(kms.get(j));
            }
            if(null == kid)
            {
                if(listKM.size()>0)
                    kid =listKM.get(0).getId();
            }
            model.addAttribute("kms",listKM);
            List<KmShijuan> shijs = shiJuanService.selectByRid(kid);
            model.addAttribute("kmid",kid);
            model.addAttribute("rzid",rid);
            model.addAttribute("shijs",shijs);
            return "ShiJuanList2";
        }
    }
    @RequestMapping(value="/renz")
    public String getRenz(Model model)
    {
        List<RenZheng> renzs;
        renzs =renZService.selectAll();
        model.addAttribute("renzs",renzs);
        return "RenZList";
    }

    @RequestMapping("/queryRenKM")
    public String getRenKM(Long rid,Model model)
    {

        List<RenzKm> kms = renKMService.selectByRid(rid);
        model.addAttribute("kms",kms);
        model.addAttribute("rid",rid) ;
        return "KMList";

    }
    @RequestMapping("/queryKaot")
    public String queryKaot(Long sid,Model model)
    {
        List<Kaot> kts = kaotiService.selectBySid(sid);
        KmShijuan sj   =shiJuanService.selectById(sid);
        RenzKm km  =renKMService.selectById(sj.getKmid());
        model.addAttribute("kts",kts);
        model.addAttribute("sid",sid);
        model.addAttribute("kmid",sj.getKmid());
        model.addAttribute("rzid",km.getRid());
        if(null != sj)
            model.addAttribute("shij",sj.getKmsj());
        return "Kaot";
    }

    @RequestMapping("/welcome")
    public String welcome()
    {
        return "welcome";
    }

    @RequestMapping(value ="/kerror")
    public String kerror()
    {
        return "error";
    }
}
