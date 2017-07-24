package com.internousdev.tamaya.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.tamaya.dto.CreditDTO;

public class CreditDTOTest {

	//ここからemail
	/**
	 * creditDTO, email
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail1() {
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
		int expected = 0;

		test.setExpirationMonth(expected);

		assertEquals(expected, test.getExpirationMonth());
	}

	/**
	 * creditDTO, ExpirationMonth
	 * のためのテスト・メソッド。
	 */
	public void testGetExpirationMonth2() {
		CreditDTO test = new CreditDTO();
		int expected = 2147483647;

		test.setExpirationMonth(expected);

		assertEquals(expected, test.getExpirationMonth());
	}

	/**
	 * creditDTO, ExpirationMonth
	 * のためのテスト・メソッド。
	 */
	public void testGetExpirationMonth3() {
		CreditDTO test = new CreditDTO();
		int expected = -2147483648;

		test.setExpirationMonth(expected);

		assertEquals(expected, test.getExpirationMonth());
	}

	/**
	 * creditDTO, ExpirationMonth
	 * のためのテスト・メソッド。
	 */
	public void testGetExpirationMonth4() {
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
		int expected = 0;

		test.setExpirationMonth(expected);

		assertEquals(expected, test.getExpirationMonth());
	}

	/**
	 * creditDTO, ExpirationMonth
	 * のためのテスト・メソッド。
	 */
	public void testSetExpirationMonth2() {
		CreditDTO test = new CreditDTO();
		int expected = 2147483647;

		test.setExpirationMonth(expected);

		assertEquals(expected, test.getExpirationMonth());
	}

	/**
	 * creditDTO, ExpirationMonth
	 * のためのテスト・メソッド。
	 */
	public void testSetExpirationMonth3() {
		CreditDTO test = new CreditDTO();
		int expected = -2147483648;

		test.setExpirationMonth(expected);

		assertEquals(expected, test.getExpirationMonth());
	}

	/**
	 * creditDTO, ExpirationMonth
	 * のためのテスト・メソッド。
	 */
	public void testSetExpirationMonth4() {
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
		int expected = 0;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());
	}

	public void testGetExpirationYear2() {
		CreditDTO test = new CreditDTO();
		int expected = 2147483647;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());
	}

	public void testGetExpirationYear3() {
		CreditDTO test = new CreditDTO();
		int expected = -2147483648;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());
	}

	public void testGetExpirationYear4() {
		CreditDTO test = new CreditDTO();
		try {
			int ExpirationMonthMin = Integer.parseInt("2147483648");
			test.setExpirationYear(ExpirationMonthMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	public void testGetExpirationYear5() {
		CreditDTO test = new CreditDTO();
		try {
			int ExpirationMonthMin = Integer.parseInt("-2147483649");
			test.setExpirationYear(ExpirationMonthMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}


	@Test
	public void testSetExpirationYear1() {
		CreditDTO test = new CreditDTO();
		int expected = 0;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());
	}

	public void testSetExpirationYear2() {
		CreditDTO test = new CreditDTO();
		int expected = 2147483647;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());
	}

	public void testSetExpirationYear3() {
		CreditDTO test = new CreditDTO();
		int expected = -2147483648;

		test.setExpirationYear(expected);

		assertEquals(expected, test.getExpirationYear());
	}

	public void testSetExpirationYear4() {
		CreditDTO test = new CreditDTO();
		try {
			int ExpirationYearMin = Integer.parseInt("2147483648");
			test.setExpirationYear(ExpirationYearMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	public void testSetExpirationYear5() {
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
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
		CreditDTO test = new CreditDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFirstName(expected);
		String actual = test.getFirstName();

		assertEquals(expected, actual);

	}

//ここから支払い回数
	/**
	 * creditDTO, paymentId
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPaymentId1() {
		CreditDTO test = new CreditDTO();
		int expected = 0;

		test.setPaymentId(expected);

		assertEquals(expected, test.getPaymentId());

	}

	/**
	 * creditDTO, paymentId
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPaymentId2() {
		CreditDTO test = new CreditDTO();
		int expected = 2147483647;

		test.setPaymentId(expected);

		assertEquals(expected, test.getPaymentId());
	}

	/**
	 * creditDTO, paymentId
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPaymentId3() {
		CreditDTO test = new CreditDTO();
		int expected = -2147483648;

		test.setPaymentId(expected);

		assertEquals(expected, test.getPaymentId());
	}

	/**
	 * creditDTO, paymentId
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPaymentId4() {
		CreditDTO test = new CreditDTO();
		try {
			int PaymentIdMin = Integer.parseInt("2147483648");
			test.setPaymentId(PaymentIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * creditDTO, paymentId
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPaymentId5() {
		CreditDTO test = new CreditDTO();
		try {
			int PaymentIdMin = Integer.parseInt("-2147483649");
			test.setPaymentId(PaymentIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * creditDTO, paymentId
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPaymentId1() {
		CreditDTO test = new CreditDTO();
		int expected = 0;

		test.setPaymentId(expected);
		int actual = test.getPaymentId();

		assertEquals(expected, actual);
	}


	/**
	 * creditDTO, paymentId
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPaymentId2() {
		CreditDTO test = new CreditDTO();
		int expected = 2147483647;

		test.setPaymentId(expected);
		int actual = test.getPaymentId();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, paymentId
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPaymentId3() {
		CreditDTO test = new CreditDTO();
		int expected = -2147483648;

		test.setPaymentId(expected);
		int actual = test.getPaymentId();

		assertEquals(expected, actual);
	}

	/**
	 * creditDTO, paymentId
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPaymentId4() {
		CreditDTO test = new CreditDTO();
		try {
			int PaymentIdMax = Integer.parseInt("2147483648");
			test.setPaymentId(PaymentIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * creditDTO, paymentId
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPaymentId5() {
		CreditDTO test = new CreditDTO();
		try {
			int PaymentIdMax = Integer.parseInt("-2147483649");
			test.setPaymentId(PaymentIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}
}
