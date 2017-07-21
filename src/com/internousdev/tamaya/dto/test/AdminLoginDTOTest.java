package com.internousdev.tamaya.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.tamaya.dto.AdminLoginDTO;

public class AdminLoginDTOTest {

	/**
	 * {@link com.internousdev.tamaya.dto.AdminLoginDTO#getUserId()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId1() {
		AdminLoginDTO test = new AdminLoginDTO();
		int expected = 0;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());

	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getUserId()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId2() {
		AdminLoginDTO test = new AdminLoginDTO();
		int expected = 2147483647;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getUserId()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId3() {
		AdminLoginDTO test = new AdminLoginDTO();
		int expected = -2147483648;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getUserId()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId4() {
		AdminLoginDTO test = new AdminLoginDTO();
		try {
			int UserIdMin = Integer.parseInt("2147483648");
			test.setUserId(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getUserId()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId5() {
		AdminLoginDTO test = new AdminLoginDTO();
		try {
			int UserIdMin = Integer.parseInt("-2147483649");
			test.setUserId(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#setUserId(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId1() {
		AdminLoginDTO test = new AdminLoginDTO();
		int expected = 0;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#setUserId(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId2() {
		AdminLoginDTO test = new AdminLoginDTO();
		int expected = 2147483647;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#setUserId(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId3() {
		AdminLoginDTO test = new AdminLoginDTO();
		int expected = -2147483648;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#setUserId(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId4() {
		AdminLoginDTO test = new AdminLoginDTO();
		try {
			int UserIdMax = Integer.parseInt("2147483648");
			test.setUserId(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#setUserId(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId5() {
		AdminLoginDTO test = new AdminLoginDTO();
		try {
			int UserIdMax = Integer.parseInt("-2147483649");
			test.setUserId(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}


	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getUserPass()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserPass1() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = null;

		test.setUserPass(expected);
		String actual = test.getUserPass();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getUserPass()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserPass2() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "";

		test.setUserPass(expected);
		String actual = test.getUserPass();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getUserPass()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserPass3() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = " ";

		test.setUserPass(expected);
		String actual = test.getUserPass();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getUserPass()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserPass4() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "　";

		test.setUserPass(expected);
		String actual = test.getUserPass();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getUserPass()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserPass5() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "abc123";

		test.setUserPass(expected);
		String actual = test.getUserPass();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getUserPass()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserPass6() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "あいう１２３";

		test.setUserPass(expected);
		String actual = test.getUserPass();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getUserPass()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserPass7() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "abc123あいう１２３";

		test.setUserPass(expected);
		String actual = test.getUserPass();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getUserPass()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserPass8() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUserPass(expected);
		String actual = test.getUserPass();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#setUserPass(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserPass1() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = null;

		test.setUserPass(expected);
		String actual = test.getUserPass();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#setUserPass(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserPass2() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "";

		test.setUserPass(expected);
		String actual = test.getUserPass();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#setUserPass(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserPass3() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = " ";

		test.setUserPass(expected);
		String actual = test.getUserPass();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#setUserPass(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserPass4() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "　";

		test.setUserPass(expected);
		String actual = test.getUserPass();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.legmina.dto.LoginDTO#setUserPass(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserPass5() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "abc123";

		test.setUserPass(expected);
		String actual = test.getUserPass();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.legmina.dto.LoginDTO#setUserPass(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserPass6() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "あいう１２３";

		test.setUserPass(expected);
		String actual = test.getUserPass();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.legmina.dto.LoginDTO#setUserPass(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserPass7() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "abc123あいう１２３";

		test.setUserPass(expected);
		String actual = test.getUserPass();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.legmina.dto.LoginDTO#setUserPass(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserPass8() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setUserPass(expected);
		String actual = test.getUserPass();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#LoginFlg()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testIsLoginFlg1() {
		AdminLoginDTO test = new AdminLoginDTO();
		boolean expected = true;

		test.setLoginFlg(expected);
		boolean actual=test.getLoginFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#LoginFlg()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testIsLoginFlg2() {
		AdminLoginDTO test = new AdminLoginDTO();
		boolean expected = false;

		test.setLoginFlg(expected);
		boolean actual=test.getLoginFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#LoginFlg()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetLoginFlg1() {
		AdminLoginDTO test = new AdminLoginDTO();
		boolean expected = true;

		test.setLoginFlg(expected);
		boolean actual=test.getLoginFlg();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#LoginFlg()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetLoginFlg2() {
		AdminLoginDTO test = new AdminLoginDTO();
		boolean expected = false;

		test.setLoginFlg(expected);
		boolean actual=test.getLoginFlg();
		assertEquals(expected, actual);
	}




	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPhoneEmail1() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = null;

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail2() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail3() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = " ";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail4() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "　";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail5() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "abc123";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail6() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "あいう１２３";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail7() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "abc123あいう１２３";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail8() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail1() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = null;

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail2() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail3() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = " ";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail4() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "　";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail5() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "abc123";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail6() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "あいう１２３";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail7() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "abc123あいう１２３";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.LoginDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail8() {
		AdminLoginDTO test = new AdminLoginDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setEmail(expected);
		String actual = test.getEmail();

		assertEquals(expected, actual);

	}

}
