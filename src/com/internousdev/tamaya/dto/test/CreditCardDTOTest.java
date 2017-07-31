package com.internousdev.tamaya.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.tamaya.dto.CreditCardDTO;

/**
 * クレジット情報に関するDTOクラス
 *
 * @author YUKO TSUJI
 * @since 1.0
 */
public class CreditCardDTOTest {
	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getCreditBrand()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditBrand1() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 0;
		test.setCreditBrand(expected);
		assertEquals(expected, test.getCreditBrand());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getCreditBrand()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditBrand2() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 2147483647;
		test.setCreditBrand(expected);
		assertEquals(expected, test.getCreditBrand());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getCreditBrand()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditBrand3() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = -2147483648;
		test.setCreditBrand(expected);
		assertEquals(expected, test.getCreditBrand());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getCreditBrand()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditBrand4() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int outOfRange = Integer.parseInt("2147483648");
			test.setCreditBrand(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getCreditBrand()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditBrand5() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int outOfRange = Integer.parseInt("-2147483649");
			test.setCreditBrand(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.CreditCardDTO#setCreditBrand(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditBrand1() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 0;
		test.setCreditBrand(expected);
		int actual = test.getCreditBrand();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.CreditCardDTO#setCreditBrand(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditBrand2() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 2147483647;
		test.setCreditBrand(expected);
		int actual = test.getCreditBrand();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.CreditCardDTO#setCreditBrand(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditBrand3() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = -2147483648;
		test.setCreditBrand(expected);
		int actual = test.getCreditBrand();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.CreditCardDTO#setCreditBrand(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditBrand4() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int outOfRange = Integer.parseInt("2147483648");
			test.setCreditBrand(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.CreditCardDTO#setCreditBrand(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditBrand5() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int outOfRange = Integer.parseInt("-2147483649");
			test.setCreditBrand(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getExpirationYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationYear1() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 0;
		test.setExpirationYear(expected);
		assertEquals(expected, test.getExpirationYear());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getExpirationYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationYear2() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 2147483647;
		test.setExpirationYear(expected);
		assertEquals(expected, test.getExpirationYear());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getExpirationYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationYear3() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = -2147483648;
		test.setExpirationYear(expected);
		assertEquals(expected, test.getExpirationYear());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getExpirationYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationYear4() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int outOfRange = Integer.parseInt("2147483648");
			test.setExpirationYear(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getExpirationYear()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationYear5() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int outOfRange = Integer.parseInt("-2147483649");
			test.setExpirationYear(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.CreditCardDTO#setExpirationYear(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationYear1() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 0;
		test.setExpirationYear(expected);
		int actual = test.getExpirationYear();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.CreditCardDTO#setExpirationYear(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationYear2() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 2147483647;
		test.setExpirationYear(expected);
		int actual = test.getExpirationYear();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.CreditCardDTO#setExpirationYear(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationYear3() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = -2147483648;
		test.setExpirationYear(expected);
		int actual = test.getExpirationYear();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.CreditCardDTO#setExpirationYear(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationYear4() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int outOfRange = Integer.parseInt("2147483648");
			test.setExpirationYear(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.CreditCardDTO#setExpirationYear(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationYear5() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int outOfRange = Integer.parseInt("-2147483649");
			test.setExpirationYear(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getExpirationMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationMonth1() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 0;
		test.setExpirationMonth(expected);
		assertEquals(expected, test.getExpirationMonth());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getExpirationMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationMonth2() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 2147483647;
		test.setExpirationMonth(expected);
		assertEquals(expected, test.getExpirationMonth());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getExpirationMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationMonth3() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = -2147483648;
		test.setExpirationMonth(expected);
		assertEquals(expected, test.getExpirationMonth());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getExpirationMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationMonth4() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int outOfRange = Integer.parseInt("2147483648");
			test.setExpirationMonth(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getExpirationMonth()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetExpirationMonth5() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int outOfRange = Integer.parseInt("-2147483649");
			test.setExpirationMonth(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.CreditCardDTO#setExpirationMonth(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationMonth1() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 0;
		test.setExpirationMonth(expected);
		int actual = test.getExpirationMonth();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.CreditCardDTO#setExpirationMonth(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationMonth2() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 2147483647;
		test.setExpirationMonth(expected);
		int actual = test.getExpirationMonth();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.CreditCardDTO#setExpirationMonth(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationMonth3() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = -2147483648;
		test.setExpirationMonth(expected);
		int actual = test.getExpirationMonth();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.CreditCardDTO#setExpirationMonth(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationMonth4() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int outOfRange = Integer.parseInt("2147483648");
			test.setExpirationMonth(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.CreditCardDTO#setExpirationMonth(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationMonth5() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int outOfRange = Integer.parseInt("-2147483649");
			test.setExpirationMonth(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "null";
		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber2() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "";
		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber3() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = " ";
		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber4() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "　";
		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber5() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123";
		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber6() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "あいう１２３";
		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber7() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123あいう１２３";
		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getCreditNumber()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber8() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setCreditNumber(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "null";
		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setCreditNumber(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber2() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "";
		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setCreditNumber(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber3() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = " ";
		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setCreditNumber(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber4() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "　";
		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setCreditNumber(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber5() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123";
		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setCreditNumber(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber6() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "あいう１２３";
		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setCreditNumber(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber7() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123あいう１２３";
		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setCreditNumber(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber8() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "null";
		test.setNameE(expected);
		String actual = test.getNameE();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE2() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "";
		test.setNameE(expected);
		String actual = test.getNameE();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE3() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = " ";
		test.setNameE(expected);
		String actual = test.getNameE();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE4() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "　";
		test.setNameE(expected);
		String actual = test.getNameE();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE5() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123";
		test.setNameE(expected);
		String actual = test.getNameE();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE6() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "あいう１２３";
		test.setNameE(expected);
		String actual = test.getNameE();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE7() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123あいう１２３";
		test.setNameE(expected);
		String actual = test.getNameE();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getNameE()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE8() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setNameE(expected);
		String actual = test.getNameE();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setNameE(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameE1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "null";
		test.setNameE(expected);
		String actual = test.getNameE();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setNameE(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameE2() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "";
		test.setNameE(expected);
		String actual = test.getNameE();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setNameE(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameE3() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = " ";
		test.setNameE(expected);
		String actual = test.getNameE();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setNameE(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameE4() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "　";
		test.setNameE(expected);
		String actual = test.getNameE();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setNameE(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameE5() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123";
		test.setNameE(expected);
		String actual = test.getNameE();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setNameE(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameE6() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "あいう１２３";
		test.setNameE(expected);
		String actual = test.getNameE();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setNameE(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameE7() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123あいう１２３";
		test.setNameE(expected);
		String actual = test.getNameE();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setNameE(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameE8() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setNameE(expected);
		String actual = test.getNameE();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getSecurityCode()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "null";
		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getSecurityCode()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode2() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "";
		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getSecurityCode()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode3() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = " ";
		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getSecurityCode()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode4() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "　";
		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getSecurityCode()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode5() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123";
		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getSecurityCode()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode6() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "あいう１２３";
		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getSecurityCode()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode7() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123あいう１２３";
		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#getSecurityCode()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode8() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setSecurityCode(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "null";
		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setSecurityCode(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode2() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "";
		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setSecurityCode(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode3() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = " ";
		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setSecurityCode(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode4() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "　";
		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setSecurityCode(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode5() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123";
		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setSecurityCode(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode6() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "あいう１２３";
		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setSecurityCode(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode7() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123あいう１２３";
		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CreditCardDTO#setSecurityCode(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode8() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setSecurityCode(expected);
		String actual = test.getSecurityCode();
		assertEquals(expected, actual);
	}

}
