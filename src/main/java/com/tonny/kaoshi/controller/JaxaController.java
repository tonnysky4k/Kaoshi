package com.tonny.kaoshi.controller;
import com.tonny.kaoshi.entity.*;
import com.tonny.kaoshi.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@RestController
public class JaxaController {
    @Autowired
    KaotiService kaotiService;
    @Autowired
    AnsService ansService;

    @Autowired
    KaochjService kaochjService;

    @Autowired
    UserService userService;

    @Autowired
    SmsService smsService;

    @Autowired
    RenZService renZService;

    @Autowired
    RenKMService renKMService;

    @Autowired
    ShiJuanService shiJuanService;

    @Autowired
    UserRightService userRightService;

    @Autowired
    LoginService loginService;

    User g_user =null;

    @RequestMapping(value="/insertKaot",method = RequestMethod.POST)
    public int insertKaot(Tkem tk)
    {
        Daan daan = new Daan();
        Kaot kaot = new Kaot();
        kaot.setT_pro(tk.getTts());
        kaot.setT_type(tk.getTyp());
        kaot.setT_desc(tk.getDesc());
        kaot.setT_zhan(tk.getZhan());
        kaot.setT_you("");
        kaot.setId(0L);
        kaot.setSid(tk.getSid());
        kaotiService.insertKm(kaot);
        Long maxid ;
        maxid = kaotiService.selectMaxId();

        daan.setId(0L);
        daan.setTid(maxid);
        daan.setT_asn(tk.getAn1());
        ansService.insertAns(daan);
        daan.setT_asn(tk.getAn2());
        ansService.insertAns(daan);
        daan.setT_asn(tk.getAn3());
        ansService.insertAns(daan);
        daan.setT_asn(tk.getAn4());
        ansService.insertAns(daan);

        return 1;
    }

    @RequestMapping(value="/saveKaos",method = RequestMethod.POST)
    public int insertKaos(@RequestBody List<KaosDan> kds)
    {
        String ls_date =null;
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddhhmmss");
        ls_date=sf.format(new Date());
        for(int i = 0;i<kds.size();i++)
        {
            KaosDan kd =kds.get(i);
            kd.setKsdate(ls_date);
            if(g_user !=null) kd.setKname(g_user.getPho());
            kaochjService.insertKaos(kd);
        }
        return 1;
    }

    @RequestMapping(value="/vali-login",method = RequestMethod.POST)
    public int validateLogin(Login login, HttpServletRequest request)
    {
        HttpSession session = request.getSession();
        User u=userService.selectByPho(login.getUname());
        Login l =loginService.selectByNameS(login);
        if(null == u) return -2;
        g_user =u;
        //管理员验证账号
        if(login.getUname().equals("Admin"))
        {
            //管理员验证密码
            if(u.getScode().equals(login.getScode()))
                session.setAttribute("user", u);
            else
                return -1;//验证密码失败
        }else
        {
            //手机用户验证账号
            if(null != l )//手机+验证码  验证成功
                session.setAttribute("user", u);
            else
                return -3;//手机+验证码  验证失败
        }
        return 1;
    }

    @RequestMapping(value="/sendsms",method = RequestMethod.POST)

    public int sendSms(String pho) throws Exception
    {
        smsService.sendSms(pho);
        return 1;
    }

    @RequestMapping(value="/queryKm",method = RequestMethod.POST)
    public Tkem queryKm(Long id)
    {
        Tkem km = new Tkem();
        Kaot kt = kaotiService.selectById(id);
        km.setId(id);
        km.setTts(kt.getT_pro());
        km.setTyp(kt.getT_type());
        km.setZhan(kt.getT_zhan());
        List<Daan> ans = ansService.selectById(id);
        if(ans.size() ==4) {
            km.setAn1(ans.get(0).getT_asn());
            km.setAn2(ans.get(1).getT_asn());
            km.setAn3(ans.get(2).getT_asn());
            km.setAn4(ans.get(3).getT_asn());
        }
        return km;
    }

    @RequestMapping(value="/delKaot",method = RequestMethod.POST)
    public void delKaot(Long id)
    {
        kaotiService.deleteKm(id);
        ansService.deleteAns(id);
    }

    @RequestMapping(value="/updateKaot",method =RequestMethod.POST)
    public void updateKaot(Tkem km)
    {
        Kaot kt  =new Kaot();
        kt.setId(km.getId());
        kt.setT_pro(km.getTts());
        kt.setT_type(km.getTyp());
        kt.setT_zhan(km.getZhan());
        kt.setT_desc(km.getDesc());

        kaotiService.updateKm(kt);
        List<Daan> ans =ansService.selectById(km.getId());
        if(ans.size()!=4) return;
        ans.get(0).setT_asn(km.getAn1());
        ans.get(1).setT_asn(km.getAn2());
        ans.get(2).setT_asn(km.getAn3());
        ans.get(3).setT_asn(km.getAn4());
        ansService.updateAns(ans.get(0));
        ansService.updateAns(ans.get(1));
        ansService.updateAns(ans.get(2));
        ansService.updateAns(ans.get(3));

    }
    @RequestMapping(value="/searchKt",method =RequestMethod.POST)
    public List<Kaot> searchKt(Long sid,String title)
    {
        List<Kaot> kts ;
        String t_pro =title;
        Kaot kt = new Kaot();
        kt.setT_pro(title);
        kt.setSid(sid);
        kts = kaotiService.selectByName(kt);
        return kts;
    }

    @RequestMapping(value="/insertRZ",method = RequestMethod.POST)
    public int insertRZ(RenZheng rz)
    {
        renZService.insertRenz(rz);
        return 1;
    }

    @RequestMapping(value="/deleteRZ",method = RequestMethod.POST)
    public void deleteRZ(Long id )
    {
        renZService.deleteRenz(id);
    }

    @RequestMapping(value="/updateRZ",method = RequestMethod.POST)
    public int updateRZ(RenZheng rz )
    {
        renZService.updateRenz(rz);
        return 1;
    }

    @RequestMapping(value="/getRZ",method = RequestMethod.GET)
    public List<RenZheng> getRZ()
    {
        return  renZService.selectAll();
    }

    @RequestMapping(value="/getKM",method = RequestMethod.GET)
    public  List<RenzKm> getKM(Long rid)
    {
        return renKMService.selectByRid(rid);
    }

    @RequestMapping(value="/insertRenKM",method = RequestMethod.POST)
    public int insertRenKM(RenzKm km)
    {
        renKMService.insertRenKM(km);
        return 1;
    }


    @RequestMapping(value="/updateRenKM",method = RequestMethod.POST)
    public int updateRenKM(RenzKm km)
    {
        renKMService.updateRenKM(km);
        return 1;
    }
    @RequestMapping(value="/deleteRenKM",method = RequestMethod.POST)
    public int deleteRenKM(Long  id)
    {
        renKMService.deleteRenKM(id);
        return 1;
    }

    @RequestMapping(value="/insertShiJ",method = RequestMethod.POST)
    public int insertShiJ(KmShijuan sj)
    {
        Date ldt = new java.util.Date();
        sj.setSjdate(ldt);
        shiJuanService.insertShiJ(sj);
        return 1;
    }

    @RequestMapping(value="/updateShiJ",method = RequestMethod.POST)
    public int updateShiJ(KmShijuan sj)
    {
        Date ldt = new java.util.Date();
        sj.setSjdate(ldt);
        shiJuanService.updateShiJ(sj);
        return 1;
    }
    @RequestMapping(value="/deleteShiJ",method = RequestMethod.POST)
    public int updateShiJ(Long  id)
    {
        shiJuanService.deleteShiJ(id);
        return 1;
    }


    @RequestMapping(value="/findShiJ",method = RequestMethod.POST)
    public List<KmShijuan> findShiJ(Long  id)
    {
        List<KmShijuan> sjs =shiJuanService.selectByRid(id);
        return sjs;
    }

    @RequestMapping(value ="/insertUserRight",method = RequestMethod.POST)
    public int insertUserRight(UserRight ur)
    {
        ur.setOutdate(new Date());
        userRightService.insertUserRight(ur);
        return 1;
    }

    @RequestMapping(value ="/deleteUserRight",method = RequestMethod.POST)
        public int deleteUserRight(Long id)
        {
            userRightService.deleteUserRight(id);
            return 1;
        }
}
