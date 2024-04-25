package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "220473748";
		Assert.assertNotNull("Student ID is 220473748", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Rohit Rajendra Kadam";
		Assert.assertNotNull("Student name is Rohit Rajendra Kadam", studentName);
	}
	
	@Test
	public void testWindSpeedExceedsdangerouslimit() {
	    Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(71.0, 3.0)); 
	}
	
	@Test
	public void testWindSpeedExceedsdangerouslimitandRainfallzero() {
	    Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(71.0, 0.0)); 
	}
	
	@Test
	public void testRainfallExceedsdangerouslimitandWindspeedzero() {
	    Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(0.0, 6.5)); 
	}
	
	
	@Test
    public void testWindSpeedandRainfallExceedsConcerninglimit() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(61.0, 5.0)); 
    }

    @Test
    public void testRainfallExceedsDangerousLimit() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(44.0, 6.1)); 
    }
    
    @Test
    public void testWindSpeedAndRainfallExceedsDangerousLimit() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(71.0, 7.0)); 
    }
    
    @Test
    public void testWindSpeedExceedsDangerousAndRainfallExceedsConcerningLimit() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(72.0, 5.0)); 
    }
    
    @Test
    public void testWindSpeedExceedsConcerningAndRainfallExceedsDangerousLimit() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(48.0, 8.0)); 
    }
    
    @Test
    public void testWindSpeedExceedsConcerningLimit() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(55.0, 4.1)); 
    }
    
    @Test
    public void testRainfallexceedsConcerningLimit() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(45.1, 5.0)); 
    }

	@Test
	public void testWarnWindspeedexceedConcerningwindspeed() {
	    Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 3.0)); 
	}
	
	
	@Test
    public void testWarnWindspeedexceedConcerningWindSpeedzeroRainfall() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(45.1, 0.0)); 
    }

    @Test
    public void testWarnRainfallExceedsconcerningrainfall() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(30.0, 4.1)); 
    }

    @Test
    public void testWarnWindspeedExceedsconcerninglimitandrainfallremainsatconcerningrainfall() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(46.0, 4.0)); 
    }
    
    @Test
    public void testWarnRainfallexceedsconcerningrainfallzerowindspeed() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(0.0, 4.5)); 
    }

	@Test
	public void testAllClearWeather1() {
	    Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(40.0, 2.0)); 
	} 
	
	@Test
	public void testAllClearWeather2() {
	    Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(0.0, 3.0)); 
	} 
	
	@Test
	public void testAllClearWeather3() {
	    Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(35.0, 0.0)); 
	} 

    @Test
    public void testAllClearWeather4() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 2.0)); 
    }
    
    @Test
    public void testAllClearWeather5() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(20.0, 1.0)); 
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWeatherAdviceWindSpeedNegativeValues() {
        WeatherAndMathUtils.weatherAdvice(-10.0, 3.0);
    }
    
    @Test
    public void testWindSpeedWithinConcerningLimitsButNotDangerous() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(44.0, 3.0));
    }

    @Test
    public void testRainfallWithinConcerningLimitsButNotDangerous() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(40.0, 4.0));
    }

    @Test
    public void testWindSpeedAndRainfallWithinConcerningLimitsButNotDangerous() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(42.0, 3.5));
    }


    @Test
    public void testWindSpeedAndRainfallExceedsConcerningLimitsButNotDangerous() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(50.0, 4.5));
    }

    @Test
    public void testWindSpeedExceedsConcerningButNotDangerousAndRainfallWithinConcerningLimits() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(46.0, 4.0));
    }

    @Test
    public void testWindSpeedAndRainfallExceedsConcerningButNotDangerousLimits() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 4.0));
    }

    @Test
    public void testWindSpeedAndRainfallWithinDangerousLimitsButNotExceedingConcerningLimits() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(27.0, 2.5));
    }
    
    
  
    
    
	@Test
	public void testEvenNumberFor4() {
	    Assert.assertTrue(WeatherAndMathUtils.isEven(4));
	}

	@Test
	public void testOddNumberFor5() {
	    Assert.assertFalse(WeatherAndMathUtils.isEven(5));
	}

	@Test
	public void testEvenNumberForZero() {
	    Assert.assertTrue(WeatherAndMathUtils.isEven(0));
	}

	@Test
	public void testEvenNumberForNegative3() {
	    Assert.assertFalse(WeatherAndMathUtils.isEven(-3));
	}
	


	@Test
	public void testPrimeNumberFor2() {
	    Assert.assertTrue(WeatherAndMathUtils.isPrime(2));
	}

	@Test
	public void testNonPrimeNumberFor4() {
	    Assert.assertFalse(WeatherAndMathUtils.isPrime(4));
	}

	@Test
	public void testPrimeNumberFor17() {
	    Assert.assertTrue(WeatherAndMathUtils.isPrime(17));
	}
	
	@Test
	public void testPrimeNumberFor1() {
	    Assert.assertTrue(WeatherAndMathUtils.isPrime(1));
	}
	
	
	@Test
	public void testPrimeNumberFor12() {
	    Assert.assertFalse(WeatherAndMathUtils.isPrime(12)); 
	}
	

	
	@Test
    public void testPrimeNumberFor0() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(0)); 
    }
	
	
	 @Test
	    public void testSumofNumbersupto7() {
	        Loop newloop = new Loop();
	        int result = newloop.SumoftheNumbers(7);
	        Assert.assertEquals(28, result); 
	    }
	 
	 @Test
	    public void testSumofNumbersupto10() {
	        Loop newloop = new Loop();
	        int result = newloop.SumoftheNumbers(10);
	        Assert.assertEquals(55, result); 
	    }
	 
	 @Test
	 public void testSumOfNumbersZero() {
	     Loop lp = new Loop();
	     int result = lp.SumoftheNumbers(0);
	     Assert.assertEquals(0, result); 
	 }
	 
	 @Test
	 public void testSumOfNumbersNegative() {
	     Loop loop = new Loop();
	     int result = loop.SumoftheNumbers(-5);
	     Assert.assertEquals(0, result); 
	 }
	 
	 @Test
	 public void testSumOfNumbersUpto30() {
	     Loop loop = new Loop();
	     int result = loop.SumoftheNumbers(30);
	     Assert.assertEquals(465, result); 
	 }
	 
	 
	 @Test
	    public void testSumOfEvenAndOddNumberswithoddnumberd5() {
	        Loop nwloop = new Loop();
	        int result1 = nwloop.sumOfEvenAndOddNumbers(5);
	        Assert.assertEquals(15, result1); 
	 }
	 
	 @Test
	    public void testSumOfEvenAndOddNumberswithevennumber6() {
	        Loop nwloop = new Loop();
	        int result1 = nwloop.sumOfEvenAndOddNumbers(6);
	        Assert.assertEquals(21, result1); 
	 }
	 
	 @Test
	    public void testSumOfEvenAndOddNumberswithevennumber13() {
	        Loop nwloop = new Loop();
	        int result1 = nwloop.sumOfEvenAndOddNumbers(13);
	        Assert.assertEquals(91, result1); 
	 }
	 
	 
	 @Test
	 public void testSumOfEvenAndOddNumbersZero() {
	     Loop loop = new Loop();
	     int result = loop.sumOfEvenAndOddNumbers(0);
	     Assert.assertEquals(0, result); 
	 }
	 
	 @Test
	 public void testSumOfEvenAndOddNumbersNegative() {
	     Loop loop = new Loop();
	     int result = loop.sumOfEvenAndOddNumbers(-5);
	     Assert.assertEquals(0, result); 
	 }

}
