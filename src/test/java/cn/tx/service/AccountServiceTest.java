package cn.tx.service;

import cn.tx.model.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:Application.xml")
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;
    @Test
    public void selectAll(){
    }


    /**
     *
     *   5
     *
     *
     *
     *
     */
    @Test
    public void getAccountById(){
        Account account = accountService.getAccountById(1);
        System.out.println(account);
    }
    @Test
    public void save(){

        Account a = new Account();
        a.setName("赵六");
        accountService.save(a);



    }
}
