package com.sandy.android_mvvm;
import com.sandy.android_mvvm.viewmodel.*;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
//import static org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
//import org.junit.Mockito;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    UserModel usermodel=null;

    @Mock
    SigninResponse signin;
    @Rule
    public MockitoRule rule=MockitoJUnit.rule();
    @Before
    public void setUp()
    {
        usermodel=new UserModel(signin);
    }

    @Test
    public void testCheckSatus() throws Exception {
      // when(signin.statusCode("abc@gmail.com","1234567")).thenReturn(1);
       assertEquals(true,usermodel.checkStatus("abc@gmail.com","1234567"));
      // verify(signin).statusCode("abc@gmail.com","1234567");
    }
}
