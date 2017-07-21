package com.internousdev.tamaya.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.tamaya.dto.MypageDTO;

public class MypageDTOTest {

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId1() {
		MypageDTO test = new MypageDTO();
		int expected = 0;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId2() {
		MypageDTO test = new MypageDTO();
		int expected = 2147483647;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId3() {
		MypageDTO test = new MypageDTO();
		int expected = -2147483648;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId4() {
		MypageDTO test = new MypageDTO();
		try {
			int UserIdMin = Integer.parseInt("2147483648");
			test.setUserId(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId5() {
		MypageDTO test = new MypageDTO();
		try {
			int UserIdMin = Integer.parseInt("-2147483649");
			test.setUserId(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}



	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setUserId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId1() {
		MypageDTO test = new MypageDTO();
		int expected = 0;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setUserId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId2() {
		MypageDTO test = new MypageDTO();
		int expected = 2147483647;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setUserId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId3() {
		MypageDTO test = new MypageDTO();
		int expected = -2147483648;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setUserId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId4() {
		MypageDTO test = new MypageDTO();
		try {
			int UserIdMax = Integer.parseInt("2147483648");
			test.setUserId(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setUserId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId5() {
		MypageDTO test = new MypageDTO();
		try {
			int UserIdMax = Integer.parseInt("-2147483649");
			test.setUserId(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}



	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword1() {
		MypageDTO test = new MypageDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword2() {
		MypageDTO test = new MypageDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword3() {
		MypageDTO test = new MypageDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword4() {
		MypageDTO test = new MypageDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword5() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword6() {
		MypageDTO test = new MypageDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword7() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPassword8() {
		MypageDTO test = new MypageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword1() {
		MypageDTO test = new MypageDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword2() {
		MypageDTO test = new MypageDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword3() {
		MypageDTO test = new MypageDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword4() {
		MypageDTO test = new MypageDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword5() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword6() {
		MypageDTO test = new MypageDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword7() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPassword8() {
		MypageDTO test = new MypageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}


	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName1() {
		MypageDTO test = new MypageDTO();
		String expected = null;

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName2() {
		MypageDTO test = new MypageDTO();
		String expected = "";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName3() {
		MypageDTO test = new MypageDTO();
		String expected = " ";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName4() {
		MypageDTO test = new MypageDTO();
		String expected = "　";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName5() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName6() {
		MypageDTO test = new MypageDTO();
		String expected = "あいう１２３";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName7() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyName8() {
		MypageDTO test = new MypageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName1() {
		MypageDTO test = new MypageDTO();
		String expected = null;

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName2() {
		MypageDTO test = new MypageDTO();
		String expected = "";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName3() {
		MypageDTO test = new MypageDTO();
		String expected = " ";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName4() {
		MypageDTO test = new MypageDTO();
		String expected = "　";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName5() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName6() {
		MypageDTO test = new MypageDTO();
		String expected = "あいう１２３";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName7() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyName8() {
		MypageDTO test = new MypageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFamilyName(expected);
		String actual = test.getFamilyName();

		assertEquals(expected, actual);

	}




	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName1() {
		MypageDTO test = new MypageDTO();
		String expected = null;

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName2() {
		MypageDTO test = new MypageDTO();
		String expected = "";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName3() {
		MypageDTO test = new MypageDTO();
		String expected = " ";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName4() {
		MypageDTO test = new MypageDTO();
		String expected = "　";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName5() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName6() {
		MypageDTO test = new MypageDTO();
		String expected = "あいう１２３";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName7() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123あいう１２３";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenName8() {
		MypageDTO test = new MypageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName1() {
		MypageDTO test = new MypageDTO();
		String expected = null;

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName2() {
		MypageDTO test = new MypageDTO();
		String expected = "";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName3() {
		MypageDTO test = new MypageDTO();
		String expected = " ";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName4() {
		MypageDTO test = new MypageDTO();
		String expected = "　";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName5() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName6() {
		MypageDTO test = new MypageDTO();
		String expected = "あいう１２３";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName7() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123あいう１２３";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenName(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenName8() {
		MypageDTO test = new MypageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGivenName(expected);
		String actual = test.getGivenName();

		assertEquals(expected, actual);

	}





	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji1() {
		MypageDTO test = new MypageDTO();
		String expected = null;

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji2() {
		MypageDTO test = new MypageDTO();
		String expected = "";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji3() {
		MypageDTO test = new MypageDTO();
		String expected = " ";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji4() {
		MypageDTO test = new MypageDTO();
		String expected = "　";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji5() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji6() {
		MypageDTO test = new MypageDTO();
		String expected = "あいう１２３";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji7() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKanji8() {
		MypageDTO test = new MypageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji1() {
		MypageDTO test = new MypageDTO();
		String expected = null;

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji2() {
		MypageDTO test = new MypageDTO();
		String expected = "";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji3() {
		MypageDTO test = new MypageDTO();
		String expected = " ";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji4() {
		MypageDTO test = new MypageDTO();
		String expected = "　";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji5() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji6() {
		MypageDTO test = new MypageDTO();
		String expected = "あいう１２３";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji7() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKanji8() {
		MypageDTO test = new MypageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFamilyNameKanji(expected);
		String actual = test.getFamilyNameKanji();

		assertEquals(expected, actual);

	}




	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana1() {
		MypageDTO test = new MypageDTO();
		String expected = null;

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana2() {
		MypageDTO test = new MypageDTO();
		String expected = "";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana3() {
		MypageDTO test = new MypageDTO();
		String expected = " ";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana4() {
		MypageDTO test = new MypageDTO();
		String expected = "　";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana5() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana6() {
		MypageDTO test = new MypageDTO();
		String expected = "あいう１２３";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana7() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getFamilyNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetFamilyNameKana8() {
		MypageDTO test = new MypageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana1() {
		MypageDTO test = new MypageDTO();
		String expected = null;

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana2() {
		MypageDTO test = new MypageDTO();
		String expected = "";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana3() {
		MypageDTO test = new MypageDTO();
		String expected = " ";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana4() {
		MypageDTO test = new MypageDTO();
		String expected = "　";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana5() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana6() {
		MypageDTO test = new MypageDTO();
		String expected = "あいう１２３";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana7() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123あいう１２３";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setFamilyNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetFamilyNameKana8() {
		MypageDTO test = new MypageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setFamilyNameKana(expected);
		String actual = test.getFamilyNameKana();

		assertEquals(expected, actual);

	}




	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji1() {
		MypageDTO test = new MypageDTO();
		String expected = null;

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji2() {
		MypageDTO test = new MypageDTO();
		String expected = "";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji3() {
		MypageDTO test = new MypageDTO();
		String expected = " ";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji4() {
		MypageDTO test = new MypageDTO();
		String expected = "　";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji5() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji6() {
		MypageDTO test = new MypageDTO();
		String expected = "あいう１２３";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji7() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123あいう１２３";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenNameKanji()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKanji8() {
		MypageDTO test = new MypageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji1() {
		MypageDTO test = new MypageDTO();
		String expected = null;

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji2() {
		MypageDTO test = new MypageDTO();
		String expected = "";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji3() {
		MypageDTO test = new MypageDTO();
		String expected = " ";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji4() {
		MypageDTO test = new MypageDTO();
		String expected = "　";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji5() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji6() {
		MypageDTO test = new MypageDTO();
		String expected = "あいう１２３";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji7() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123あいう１２３";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenNameKanji(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKanji8() {
		MypageDTO test = new MypageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGivenNameKanji(expected);
		String actual = test.getGivenNameKanji();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana1() {
		MypageDTO test = new MypageDTO();
		String expected = null;

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana2() {
		MypageDTO test = new MypageDTO();
		String expected = "";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana3() {
		MypageDTO test = new MypageDTO();
		String expected = " ";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana4() {
		MypageDTO test = new MypageDTO();
		String expected = "　";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana5() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana6() {
		MypageDTO test = new MypageDTO();
		String expected = "あいう１２３";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana7() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123あいう１２３";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#getGivenNameKana()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetGivenNameKana8() {
		MypageDTO test = new MypageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana1() {
		MypageDTO test = new MypageDTO();
		String expected = null;

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana2() {
		MypageDTO test = new MypageDTO();
		String expected = "";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana3() {
		MypageDTO test = new MypageDTO();
		String expected = " ";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana4() {
		MypageDTO test = new MypageDTO();
		String expected = "　";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana5() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana6() {
		MypageDTO test = new MypageDTO();
		String expected = "あいう１２３";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana7() {
		MypageDTO test = new MypageDTO();
		String expected = "abc123あいう１２３";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.MypageDTO#setGivenNameKana(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetGivenNameKana8() {
		MypageDTO test = new MypageDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setGivenNameKana(expected);
		String actual = test.getGivenNameKana();

		assertEquals(expected, actual);

	}
		@Test
		public void testGetPostal1() {
			MypageDTO test = new MypageDTO();
			String expected = null;

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.MypageDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal2() {
			MypageDTO test = new MypageDTO();
			String expected = "";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.MypageDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal3() {
			MypageDTO test = new MypageDTO();
			String expected = " ";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.MypageDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal4() {
			MypageDTO test = new MypageDTO();
			String expected = "　";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.MypageDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal5() {
			MypageDTO test = new MypageDTO();
			String expected = "abc123";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.MypageDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal6() {
			MypageDTO test = new MypageDTO();
			String expected = "あいう１２３";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.MypageDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal7() {
			MypageDTO test = new MypageDTO();
			String expected = "abc123あいう１２３";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.MypageDTO#getPostal()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetPostal8() {
			MypageDTO test = new MypageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.legimina.dto.MypageDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */



		@Test
		public void testSetPostal1() {
			MypageDTO test = new MypageDTO();
			String expected = null;

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal2() {
			MypageDTO test = new MypageDTO();
			String expected = "";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal3() {
			MypageDTO test = new MypageDTO();
			String expected = " ";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal4() {
			MypageDTO test = new MypageDTO();
			String expected = "　";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal5() {
			MypageDTO test = new MypageDTO();
			String expected = "abc123";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal6() {
			MypageDTO test = new MypageDTO();
			String expected = "あいう１２３";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal7() {
			MypageDTO test = new MypageDTO();
			String expected = "abc123あいう１２３";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setPostal(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetPostal8() {
			MypageDTO test = new MypageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setPostal(expected);
			String actual = test.getPostal();

			assertEquals(expected, actual);

		}

		@Test
		public void testGetAddress1() {
			MypageDTO test = new MypageDTO();
			String expected = null;

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress2() {
			MypageDTO test = new MypageDTO();
			String expected = "";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress3() {
			MypageDTO test = new MypageDTO();
			String expected = " ";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress4() {
			MypageDTO test = new MypageDTO();
			String expected = "　";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress5() {
			MypageDTO test = new MypageDTO();
			String expected = "abc123";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress6() {
			MypageDTO test = new MypageDTO();
			String expected = "あいう１２３";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress7() {
			MypageDTO test = new MypageDTO();
			String expected = "abc123あいう１２３";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#getAddress()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetAddress8() {
			MypageDTO test = new MypageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
*/






		@Test
		public void testSetAddress1() {
			MypageDTO test = new MypageDTO();
			String expected = null;

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress2() {
			MypageDTO test = new MypageDTO();
			String expected = "";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress3() {
			MypageDTO test = new MypageDTO();
			String expected = " ";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress4() {
			MypageDTO test = new MypageDTO();
			String expected = "　";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress5() {
			MypageDTO test = new MypageDTO();
			String expected = "abc123";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress6() {
			MypageDTO test = new MypageDTO();
			String expected = "あいう１２３";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress7() {
			MypageDTO test = new MypageDTO();
			String expected = "abc123あいう１２３";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setAddress(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetAddress8() {
			MypageDTO test = new MypageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setAddress(expected);
			String actual = test.getAddress();

			assertEquals(expected, actual);

		}








		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail1() {
			MypageDTO test = new MypageDTO();
			String expected = null;

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail2() {
			MypageDTO test = new MypageDTO();
			String expected = "";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail3() {
			MypageDTO test = new MypageDTO();
			String expected = " ";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail4() {
			MypageDTO test = new MypageDTO();
			String expected = "　";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail5() {
			MypageDTO test = new MypageDTO();
			String expected = "abc123";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail6() {
			MypageDTO test = new MypageDTO();
			String expected = "あいう１２３";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail7() {
			MypageDTO test = new MypageDTO();
			String expected = "abc123あいう１２３";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail8() {
			MypageDTO test = new MypageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail1() {
			MypageDTO test = new MypageDTO();
			String expected = null;

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail2() {
			MypageDTO test = new MypageDTO();
			String expected = "";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail3() {
			MypageDTO test = new MypageDTO();
			String expected = " ";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail4() {
			MypageDTO test = new MypageDTO();
			String expected = "　";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail5() {
			MypageDTO test = new MypageDTO();
			String expected = "abc123";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail6() {
			MypageDTO test = new MypageDTO();
			String expected = "あいう１２３";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail7() {
			MypageDTO test = new MypageDTO();
			String expected = "abc123あいう１２３";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail8() {
			MypageDTO test = new MypageDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}






	public class testtest {
		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#isUserdelFlg()}
		 *  のためのテスト・メソッド。
		 */



		@Test
		public void testIsLoginFlg1() {
			MypageDTO test = new MypageDTO();
			boolean expected = true;

			test.setLoginFlg(expected);
			boolean actual=test.isLoginFlg();
			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#isLoginFlg()}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testIsLoginFlg2() {
			MypageDTO test = new MypageDTO();
			boolean expected = false;

			test.setLoginFlg(expected);
			boolean actual=test.isLoginFlg();
			assertEquals(expected, actual);
		}



		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setLoginFlg(boolean)}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testSetLoginFlg1() {
			MypageDTO test = new MypageDTO();
			boolean expected = true;

			test.setLoginFlg(expected);
			boolean actual=test.isLoginFlg();
			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.MypageDTO#setLoginFlg(boolean)}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testSetLoginFlg2() {
			MypageDTO test = new MypageDTO();
			boolean expected = false;

			test.setLoginFlg(expected);
			boolean actual=test.isLoginFlg();
			assertEquals(expected, actual);
		}

}





}
