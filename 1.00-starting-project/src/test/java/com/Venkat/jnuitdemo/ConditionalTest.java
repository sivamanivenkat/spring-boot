package com.Venkat.jnuitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {

    @Test
    @Disabled("Run this test only if told to by the development team")
    void demotest(){
        System.out.println("Disable demo test!!");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void RunOnWindowsOnly(){
        //Some statements
    }

    @Test
    @EnabledOnOs({OS.WINDOWS, OS.MAC})
    void RunOnWindowsAndMacOnly(){
        //Some statements
    }@Test
    @EnabledOnOs(OS.MAC)
    void RunOnMacOnly(){
        //Some statements
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void RunOnLinuxOnly(){
        //Some statements
    }
    @Test
    @EnabledOnJre(JRE.JAVA_21)
    void RunOnJAVA21Only(){
        //Some statements
    }
    @Test
    @EnabledOnJre(JRE.JAVA_13)
    void RunOnJAVA13Only(){
        //Some statements
    }
    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_21)
    void RunOnJAVARangeOnly(){
        //Some statements
    }
    @Test
    @EnabledForJreRange (min = JRE.JAVA_17)
    void RunOnJAVARangeMIn(){
        //Some statements
    }

    @Test
    @EnabledIfSystemProperty(named = "Mani", matches = "Dev")
    void RunIfSystemProperty(){
        //Some statements
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "Mani", matches = "Dev")
    void RunIfEnvironmentVariable(){
        //Some statements
    }
}
