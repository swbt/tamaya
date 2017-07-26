package com.internousdev.tamaya.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.tamaya.dto.CreditCardDTO;

public class CreditDTOTest {

	//ここからemail
	/**
	 * creditDTO, email
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = null;

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, email
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail2() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, email
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail3() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = " ";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, email
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail4() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "　";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, email
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail5() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, email
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail6() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "あいう１２３";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, email
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail7() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123あいう１２３";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, email
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail8() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, email
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = null;

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, email
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail2() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, email
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail3() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = " ";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, email
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail4() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "　";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, email
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail5() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, email
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail6() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "あいう１２３";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, email
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail7() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123あいう１２３";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, email
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail8() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);

	}

	//ここからクレジットの種類
	/**
	 *  creditDTO, CreditId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditId1() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 0;

		test.setCreditId(expected);

		assertEquals(expected, test.getCreditId());

	}

	/**
	 *  creditDTO, CreditId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditId2() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 2147483647;

		test.setCreditId(expected);

		assertEquals(expected, test.getCreditId());
	}

	/**
	 * creditDTO, CreditId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditId3() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = -2147483648;

		test.setCreditId(expected);

		assertEquals(expected, test.getCreditId());
	}

	/**
	 *  creditDTO, CreditId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditId4() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int CreditIdMin = Integer.parseInt("2147483648");
			test.setCreditId(CreditIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 *  creditDTO, CreditId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditId5() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int CreditIdMin = Integer.parseInt("-2147483649");
			test.setCreditId(CreditIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 *  creditDTO, CreditId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditId1() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 0;

		test.setCreditId(expected);
		int actual = test.getCreditId();

		assertEquals(expected, actual);
	}


	/**
	 *  creditDTO, CreditId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditId2() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 2147483647;

		test.setCreditId(expected);
		int actual = test.getCreditId();

		assertEquals(expected, actual);
	}

	/**
	 *  creditDTO, CreditId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditId3() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = -2147483648;

		test.setCreditId(expected);
		int actual = test.getCreditId();

		assertEquals(expected, actual);
	}

	/**
	 *  creditDTO, CreditId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditId4() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int CreditIdMax = Integer.parseInt("2147483648");
			test.setCreditId(CreditIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 *  creditDTO, CreditId
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditId5() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int CreditIdMax = Integer.parseInt("-2147483649");
			test.setCreditId(CreditIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


//  ここからクレジットナンバー
	/**
	 * creditDTO, CreditNumbe
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumber1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = null;

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, CreditNumbe
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
	 * creditDTO, CreditNumbe
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
	 * creditDTO, CreditNumbe
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
	 * creditDTO, CreditNumbe
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
	 * creditDTO, CreditNumbe
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
	 * creditDTO, CreditNumbe
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
	 * creditDTO, CreditNumbe
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
	 * creditDTO, CreditNumbe
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumber1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = null;

		test.setCreditNumber(expected);
		String actual = test.getCreditNumber();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, CreditNumbe
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
	 * creditDTO, CreditNumbe
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
	 * creditDTO, CreditNumbe
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
	 * creditDTO, CreditNumbe
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
	 * creditDTO, CreditNumbe
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
	 * creditDTO, CreditNumbe
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
	 * creditDTO, CreditNumbe
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

//ここからはクレジット名義
	/**
	 * creditDTO, nameE
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetNameE1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = null;

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, nameE
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
	 * creditDTO, nameE
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
	 * creditDTO, nameE
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
	 * creditDTO, nameE
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
	 * creditDTO, nameE
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
	 * creditDTO, nameE
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
	 * creditDTO, nameE
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
	 * creditDTO, nameE
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetNameE1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = null;

		test.setNameE(expected);
		String actual = test.getNameE();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, nameE
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
	 * creditDTO, nameE
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
	 * creditDTO, nameE
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
	 * creditDTO, nameE
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
	 * creditDTO, nameE
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
	 * creditDTO, nameE
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
	 * creditDTO, nameE
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

//  ここからセキュリティコード
	/**
	 * creditDTO, SecurityCode
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode1() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 0;

		test.setSecurityCode(expected);

		assertEquals(expected, test.getSecurityCode());
	}

	/**
	 * creditDTO, SecurityCode
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode2() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 2147483647;

		test.setSecurityCode(expected);

		assertEquals(expected, test.getSecurityCode());
	}

	/**
	 * creditDTO, SecurityCode
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode3() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = -2147483648;

		test.setSecurityCode(expected);

		assertEquals(expected, test.getSecurityCode());
	}

	/**
	 * creditDTO, SecurityCode
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode4() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int SecurityCodeMin = Integer.parseInt("2147483648");
			test.setSecurityCode(SecurityCodeMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * creditDTO, SecurityCode
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetSecurityCode5() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int SecurityCodeMin = Integer.parseInt("-2147483649");
			test.setSecurityCode(SecurityCodeMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * creditDTO, SecurityCode
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSecurityCode1() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 0;

		test.setSecurityCode(expected);
		int actual = test.getSecurityCode();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, SecurityCode
	 * のためのテスト・メソッド。
	 */
	public void testSetSecurityCode2() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 2147483647;

		test.setSecurityCode(expected);
		int actual = test.getSecurityCode();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, SecurityCode
	 * のためのテスト・メソッド。
	 */
	public void testSetSecurityCode3() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = -2147483648;

		test.setSecurityCode(expected);
		int actual = test.getSecurityCode();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, SecurityCode
	 * のためのテスト・メソッド。
	 */
	public void testSetSecurityCode4() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int SecurityCodeMax = Integer.parseInt("2147483648");
			test.setSecurityCode(SecurityCodeMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * creditDTO, SecurityCode
	 * のためのテスト・メソッド。
	 */
	public void testSetSecurityCode5() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int SecurityCodeMax = Integer.parseInt("-2147483649");
			test.setSecurityCode(SecurityCodeMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


//ここから有効期限（月）

	/**
	 * creditDTO, ExpirationMonth
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
	 * creditDTO, ExpirationMonth
	 * のためのテスト・メソッド。
	 */
	public void testGetExpirationMonth2() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 2147483647;

		test.setExpirationMonth(expected);

		assertEquals(expected, test.getExpirationMonth());
	}

	/**
	 * creditDTO, ExpirationMonth
	 * のためのテスト・メソッド。
	 */
	public void testGetExpirationMonth3() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = -2147483648;

		test.setExpirationMonth(expected);

		assertEquals(expected, test.getExpirationMonth());
	}

	/**
	 * creditDTO, ExpirationMonth
	 * のためのテスト・メソッド。
	 */
	public void testGetExpirationMonth4() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int ExpirationMonthMin = Integer.parseInt("2147483648");
			test.setExpirationMonth(ExpirationMonthMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * creditDTO, ExpirationMonth
	 * のためのテスト・メソッド。
	 */
	public void testGetExpirationMonth5() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int ExpirationMonthMin = Integer.parseInt("-2147483649");
			test.setExpirationMonth(ExpirationMonthMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * creditDTO, ExpirationMonth
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetExpirationMonth1() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 0;

		test.setExpirationMonth(expected);

		assertEquals(expected, test.getExpirationMonth());
	}

	/**
	 * creditDTO, ExpirationMonth
	 * のためのテスト・メソッド。
	 */
	public void testSetExpirationMonth2() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 2147483647;

		test.setExpirationMonth(expected);

		assertEquals(expected, test.getExpirationMonth());
	}

	/**
	 * creditDTO, ExpirationMonth
	 * のためのテスト・メソッド。
	 */
	public void testSetExpirationMonth3() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = -2147483648;

		test.setExpirationMonth(expected);

		assertEquals(expected, test.getExpirationMonth());
	}

	/**
	 * creditDTO, ExpirationMonth
	 * のためのテスト・メソッド。
	 */
	public void testSetExpirationMonth4() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int ExpirationMonthMin = Integer.parseInt("2147483648");
			test.setExpirationMonth(ExpirationMonthMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * creditDTO, ExpirationMonth
	 * のためのテスト・メソッド。
	 */
	public void testSetExpirationMonth5() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int ExpirationMonthMin = Integer.parseInt("-2147483649");
			test.setExpirationMonth(ExpirationMonthMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

//ここから有効期限（年)
	@Test
	public void testGetExpirationYear1() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 0;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());
	}

	public void testGetExpirationYear2() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 2147483647;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());
	}

	public void testGetExpirationYear3() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = -2147483648;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());
	}

	public void testGetExpirationYear4() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int ExpirationMonthMin = Integer.parseInt("2147483648");
			test.setExpirationYear(ExpirationMonthMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	public void testGetExpirationYear5() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int ExpirationMonthMin = Integer.parseInt("-2147483649");
			test.setExpirationYear(ExpirationMonthMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


	@Test
	public void testSetExpirationYear1() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 0;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());
	}

	public void testSetExpirationYear2() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = 2147483647;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());
	}

	public void testSetExpirationYear3() {
		CreditCardDTO test = new CreditCardDTO();
		int expected = -2147483648;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());
	}

	public void testSetExpirationYear4() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int ExpirationYearMin = Integer.parseInt("2147483648");
			test.setExpirationYear(ExpirationYearMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	public void testSetExpirationYear5() {
		CreditCardDTO test = new CreditCardDTO();
		try {
			int ExpirationYearMin = Integer.parseInt("-2147483649");
			test.setExpirationYear(ExpirationYearMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	//ここからクレジット番号下4ケタ(変数名なし)

	/**
	 * creditDTO, CreditNumberDown
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumberDown1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = null;

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, CreditNumberDown
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumberDown2() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, CreditNumberDown
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumberDown3() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = " ";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, CreditNumberDown
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumberDown4() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "　";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, CreditNumberDown
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumberDown5() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, CreditNumberDown
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumberDown6() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "あいう１２３";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, CreditNumberDown
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumberDown7() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123あいう１２３";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, CreditNumberDown
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreditNumberDown8() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, CreditNumberDown
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumberDown1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = null;

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, CreditNumberDown
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumberDown2() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, CreditNumberDown
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumberDown3() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = " ";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, CreditNumberDown
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumberDown4() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "　";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, CreditNumberDown
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumberDown5() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, CreditNumberDown
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumberDown6() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "あいう１２３";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, CreditNumberDown
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumberDown7() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123あいう１２３";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, CreditNumberDown
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreditNumberDown8() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setCreditNumberDown(expected);
		String actual = test.getCreditNumberDown();

		assertEquals(expected, actual);

	}

//ここから登録日時
	/**
	 * creditDTO, CreatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = null;

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, CreatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt2() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, CreatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt3() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = " ";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, CreatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt4() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "　";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, CreatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt5() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, CreatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt6() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "あいう１２３";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, CreatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt7() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123あいう１２３";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, CreatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetCreatedAt8() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, CreatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = null;

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, CreatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt2() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, CreatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt3() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = " ";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, CreatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt4() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "　";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, CreatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt5() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, CreatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt6() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "あいう１２３";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, CreatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt7() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123あいう１２３";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, CreatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCreatedAt8() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setCreatedAt(expected);
		String actual = test.getCreatedAt();

		assertEquals(expected, actual);

	}

//ここから更新日時

	/**
	 * creditDTO, UpdatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdatedAt1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = null;

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, UpdatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdatedAt2() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, UpdatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdatedAt3() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = " ";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, UpdatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdatedAt4() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "　";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, UpdatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdatedAt5() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, UpdatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdatedAt6() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "あいう１２３";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, UpdatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdatedAt7() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123あいう１２３";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, UpdatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUpdatedAt8() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, UpdatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdatedAt1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = null;

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, UpdatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdatedAt2() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, UpdatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdatedAt3() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = " ";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, UpdatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdatedAt4() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "　";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, UpdatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdatedAt5() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, UpdatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdatedAt6() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "あいう１２３";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, UpdatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdatedAt7() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123あいう１２３";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, UpdatedAt
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUpdatedAt8() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUpdatedAt(expected);
		String actual = test.getUpdatedAt();

		assertEquals(expected, actual);

	}

	//ここからログインID
	/**
	 * creditDTO, LoginId
	 * のためのテスト・メソッド。
	 */
		@Test
	public void testGetLoginId1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = null;

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, LoginId
	 * のためのテスト・メソッド。
	 */
	public void testGetLoginId2() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, LoginId
	 * のためのテスト・メソッド。
	 */
	public void testGetLoginId3() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = " ";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, LoginId
	 * のためのテスト・メソッド。
	 */
	public void testGetLoginId4() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "　";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, LoginId
	 * のためのテスト・メソッド。
	 */
	public void testGetLoginId5() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, LoginId
	 * のためのテスト・メソッド。
	 */
	public void testGetLoginId6() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "あいう１２３";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, LoginId
	 * のためのテスト・メソッド。
	 */
	public void testGetLoginId7() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123あいう１２３";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, LoginId
	 * のためのテスト・メソッド。
	 */
	public void testGetLoginId8() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, LoginId
	 * のためのテスト・メソッド。
	 */
	public void testSetLoginId1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = null;

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, LoginId
	 * のためのテスト・メソッド。
	 */
	public void testSetLoginId2() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, LoginId
	 * のためのテスト・メソッド。
	 */
	public void testSetLoginId3() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = " ";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, LoginId
	 * のためのテスト・メソッド。
	 */
	public void testSetLoginId4() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "　";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, LoginId
	 * のためのテスト・メソッド。
	 */
	public void testSetLoginId5() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, LoginId
	 * のためのテスト・メソッド。
	 */
	public void testSetLoginId6() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "あいう１２３";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, LoginId
	 * のためのテスト・メソッド。
	 */
	public void testSetLoginId7() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123あいう１２３";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO, LoginId
	 * のためのテスト・メソッド。
	 */
	public void testSetLoginId8() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setLoginId(expected);
		String actual = test.getLoginId();

		assertEquals(expected, actual);

	}

	//ここから姓
	/**
	 * creditDTO,LastName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetLastName1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = null;

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO,LastName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetLastName2() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO,LastName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetLastName3() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = " ";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO,LastName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetLastName4() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "　";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO,LastName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetLastName5() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO,LastName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetLastName6() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "あいう１２３";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO,LastName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetLastName7() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123あいう１２３";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO,LastName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetLastName8() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO,LastName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLastName1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = null;

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO,LastName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLastName2() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO,LastName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLastName3() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = " ";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO,LastName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLastName4() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "　";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO,LastName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLastName5() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO,LastName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLastName6() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "あいう１２３";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO,LastName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLastName7() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123あいう１２３";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO,LastName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetLastName8() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setLastName(expected);
		String actual = test.getLastName();

		assertEquals(expected, actual);

	}


	//ここから名
	/**
	 * creditDTO,FirstName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFirstName1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = null;

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO,FirstName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFirstName2() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO,FirstName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFirstName3() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = " ";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO,FirstName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFirstName4() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "　";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO,FirstName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFirstName5() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO,FirstName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFirstName6() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "あいう１２３";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO,FirstName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFirstName7() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123あいう１２３";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO,FirstName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFirstName8() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO,FirstName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFirstName1() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = null;

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO,FirstName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFirstName2() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO,FirstName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFirstName3() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = " ";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO,FirstName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFirstName4() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "　";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO,FirstName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFirstName5() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO,FirstName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFirstName6() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "あいう１２３";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO,FirstName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFirstName7() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "abc123あいう１２３";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);

	}

	/**
	 * creditDTO,FirstName
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFirstName8() {
		CreditCardDTO test = new CreditCardDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);

	}


}
