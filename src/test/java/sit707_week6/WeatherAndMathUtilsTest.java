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
	


}
