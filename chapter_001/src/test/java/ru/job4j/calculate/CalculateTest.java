package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Alexander Koleda (kaliada-biz@yandex.ru)
* @version $Id$
* @since 1.0
*/
public class CalculateTest {
	/**
	* Test echo.
	*/
	@Test
	public void whenTakeNameThenThreeEchoPlusName() {
    String input = "Alexander Koleda";
    String expect = "Echo, echo, echo : Alexander Koleda"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
	}
 
}