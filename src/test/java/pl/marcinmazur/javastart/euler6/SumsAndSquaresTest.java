package pl.marcinmazur.javastart.euler6;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SumsAndSquaresTest {
	
	SumsAndSquares sumsAndSquares = new SumsAndSquares();

	@Test
	public void shouldReturn2640() {

		// given
		int number = 10;
		int expectedResult = 2640;
		
		// when
		int result = sumsAndSquares.calcDiffrenceBetweenValues(number);
		
		// then
		assertThat(result, is(expectedResult));
	}
	
	@Test
	public void shouldReturn41230() {
		
		// given
		int number = 20;
		int expectedResult = 41230;
		
		// when
		int result = sumsAndSquares.calcDiffrenceBetweenValues(number);
		
		// then
		assertThat(result, is(expectedResult));
	}
	
	@Test
	public void shouldReturn0() {
		
		// given
		int number = 1;
		int expectedResult = 0;
		
		// when
		int result = sumsAndSquares.calcDiffrenceBetweenValues(number);
		
		// then
		assertThat(result, is(expectedResult));
	}

}
