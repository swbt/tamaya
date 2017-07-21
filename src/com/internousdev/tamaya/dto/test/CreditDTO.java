package com.internousdev.tamaya.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreditDTO {

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

		assertEquals(expected, test.getEmail());
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
	public void testSetdddddddddd1() {
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
	public void testSetdddddddddd6() {
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
			int UserIdMin = Integer.parseInt("2147483648");
			test.setSecurityCode(UserIdMin);

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
			int UserIdMin = Integer.parseInt("-2147483649");
			test.setSecurityCode(UserIdMin);

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
			int UserIdMax = Integer.parseInt("2147483648");
			test.setSecurityCode(UserIdMax);

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
			int UserIdMax = Integer.parseInt("-2147483649");
			test.setSecurityCode(UserIdMax);

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
			int UserIdMin = Integer.parseInt("2147483648");
			test.setExpirationMonth(UserIdMin);

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
			int UserIdMin = Integer.parseInt("-2147483649");
			test.setExpirationMonth(UserIdMin);

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
			int UserIdMin = Integer.parseInt("2147483648");
			test.setExpirationMonth(UserIdMin);

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
			int UserIdMin = Integer.parseInt("-2147483649");
			test.setExpirationMonth(UserIdMin);

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
			int UserIdMin = Integer.parseInt("2147483648");
			test.setExpirationYear(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	public void testGetExpirationYear5() {
		CreditDTO test = new CreditDTO();
		try {
			int UserIdMin = Integer.parseInt("-2147483649");
			test.setExpirationYear(UserIdMin);

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
			int UserIdMin = Integer.parseInt("2147483648");
			test.setExpirationYear(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	public void testSetExpirationYear5() {
		CreditDTO test = new CreditDTO();
		try {
			int UserIdMin = Integer.parseInt("-2147483649");
			test.setExpirationYear(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	private String creditNumberDown;	//クレジット番号下4ケタ(変数名なし)

	private String createdAt;			//登録日時

	private String updatedAt;			//更新日時

	private String loginId;				//ログインID

	private String lastName;			//姓名

	private String firstName;			//名前




		private int paymentId;				//支払い回数

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getCreditId() {
			return creditId;
		}

		public void setCreditId(int creditId) {
			this.creditId = creditId;
		}

		public String getCreditNumber() {
			return creditNumber;
		}

		public void setCreditNumber(String creditNumber) {
			this.creditNumber = creditNumber;
		}

		public String getNameE() {
			return nameE;
		}

		public void setNameE(String nameE) {
			this.nameE = nameE;
		}

		public int getSecurityCode() {
			return securityCode;
		}

		public void setSecurityCode(int securityCode) {
			this.securityCode = securityCode;
		}

		public int getExpirationMonth() {
			return expirationMonth;
		}

		public void setExpirationMonth(int expirationMonth) {
			this.expirationMonth = expirationMonth;
		}

		public int getExpirationYear() {
			return expirationYear;
		}

		public void setExpirationYear(int expirationYear) {
			this.expirationYear = expirationYear;
		}

		public String getCreditNumberDown() {
			return creditNumberDown;
		}

		public void setCreditNumberDown(String creditNumberDown) {
			this.creditNumberDown = creditNumberDown;
		}

		public String getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(String createdAt) {
			this.createdAt = createdAt;
		}

		public String getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(String updatedAt) {
			this.updatedAt = updatedAt;
		}

		public int getPaymentId() {
			return paymentId;
		}

		public void setPaymentId(int paymentId) {
			this.paymentId = paymentId;
		}

		public int ExpirationYear() {
			// TODO 自動生成されたメソッド・スタブ
			return 0;
		}

		public int ExpirationMonth() {
			// TODO 自動生成されたメソッド・スタブ
			return 0;
		}

		public void setCreditType(String brandName) {
			// TODO 自動生成されたメソッド・スタブ

		}

		public void setUserId(int int1) {
			// TODO 自動生成されたメソッド・スタブ

		}

		public void setLoginId(String string) {
			// TODO 自動生成されたメソッド・スタブ

		}

		public void setLastName(String string) {
			// TODO 自動生成されたメソッド・スタブ

		}

		public void setFirstName(String string) {
			// TODO 自動生成されたメソッド・スタブ

		}

		public String getLoginId() {
			// TODO 自動生成されたメソッド・スタブ
			return loginId;
		}

		public String getLastName() {
			return lastName;
		}

		public String getFirstName() {
			// TODO 自動生成されたメソッド・スタブ
			return firstName;
		}






}


