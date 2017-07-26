package com.internousdev.tamaya.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.tamaya.dto.UserDTO;

public class UserDTOTest {

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#getUserId()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId1() {
		UserDTO test = new UserDTO();
		int expected = 0;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());

	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#getUserId()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId2() {
		UserDTO test = new UserDTO();
		int expected = 2147483647;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#getUserId()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId3() {
		UserDTO test = new UserDTO();
		int expected = -2147483648;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#getUserId()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId4() {
		UserDTO test = new UserDTO();
		try {
			int UserIdMin = Integer.parseInt("2147483648");
			test.setUserId(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#getUserId()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserId5() {
		UserDTO test = new UserDTO();
		try {
			int UserIdMin = Integer.parseInt("-2147483649");
			test.setUserId(UserIdMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#setUserId(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId1() {
		UserDTO test = new UserDTO();
		int expected = 0;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#setUserId(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId2() {
		UserDTO test = new UserDTO();
		int expected = 2147483647;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#setUserId(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId3() {
		UserDTO test = new UserDTO();
		int expected = -2147483648;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#setUserId(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId4() {
		UserDTO test = new UserDTO();
		try {
			int UserIdMax = Integer.parseInt("2147483648");
			test.setUserId(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#setUserId(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserId5() {
		UserDTO test = new UserDTO();
		try {
			int UserIdMax = Integer.parseInt("-2147483649");
			test.setUserId(UserIdMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}


	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserPass1() {
		UserDTO test = new UserDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserPass2() {
		UserDTO test = new UserDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserPass3() {
		UserDTO test = new UserDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserPass4() {
		UserDTO test = new UserDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserPass5() {
		UserDTO test = new UserDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserPass6() {
		UserDTO test = new UserDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserPass7() {
		UserDTO test = new UserDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#getPassword()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserPass8() {
		UserDTO test = new UserDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserPass1() {
		UserDTO test = new UserDTO();
		String expected = null;

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserPass2() {
		UserDTO test = new UserDTO();
		String expected = "";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserPass3() {
		UserDTO test = new UserDTO();
		String expected = " ";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserPass4() {
		UserDTO test = new UserDTO();
		String expected = "　";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserPass5() {
		UserDTO test = new UserDTO();
		String expected = "abc123";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserPass6() {
		UserDTO test = new UserDTO();
		String expected = "あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserPass7() {
		UserDTO test = new UserDTO();
		String expected = "abc123あいう１２３";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#setPassword(java.lang.String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserPass8() {
		UserDTO test = new UserDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setPassword(expected);
		String actual = test.getPassword();

		assertEquals(expected, actual);

	}







	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#getUserFlg()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg1() {
		UserDTO test = new UserDTO();
		int expected = 0;

		test.setUserFlg(expected);

		assertEquals(expected, test.getUserFlg());

	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#getUserFlg()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg2() {
		UserDTO test = new UserDTO();
		int expected = 2147483647;

		test.setUserFlg(expected);

		assertEquals(expected, test.getUserFlg());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#getUserFlg()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg3() {
		UserDTO test = new UserDTO();
		int expected = -2147483648;

		test.setUserFlg(expected);

		assertEquals(expected, test.getUserFlg());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#getUserFlg()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg4() {
		UserDTO test = new UserDTO();
		try {
			int UserFlgMin = Integer.parseInt("2147483648");
			test.setUserFlg(UserFlgMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#getUserFlg()}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserFlg5() {
		UserDTO test = new UserDTO();
		try {
			int UserFlgMin = Integer.parseInt("-2147483649");
			test.setUserFlg(UserFlgMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#setUserFlg(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg1() {
		UserDTO test = new UserDTO();
		int expected = 0;

		test.setUserFlg(expected);
		int actual = test.getUserFlg();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#setUserFlg(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg2() {
		UserDTO test = new UserDTO();
		int expected = 2147483647;

		test.setUserFlg(expected);
		int actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#setUserFlg(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg3() {
		UserDTO test = new UserDTO();
		int expected = -2147483648;

		test.setUserFlg(expected);
		int actual = test.getUserFlg();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#setUserFlg(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg4() {
		UserDTO test = new UserDTO();
		try {
			int UserFlgMax = Integer.parseInt("2147483648");
			test.setUserFlg(UserFlgMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.UserDTO#setUserFlg(int)}
	 *  のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserFlg5() {
		UserDTO test = new UserDTO();
		try {
			int UserFlgMax = Integer.parseInt("-2147483649");
			test.setUserFlg(UserFlgMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#getOauthId()}
		 * のためのテスト・メソッド。
		 */
	}





		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail1() {
			UserDTO test = new UserDTO();
			String expected = null;

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail2() {
			UserDTO test = new UserDTO();
			String expected = "";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail3() {
			UserDTO test = new UserDTO();
			String expected = " ";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail4() {
			UserDTO test = new UserDTO();
			String expected = "　";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail5() {
			UserDTO test = new UserDTO();
			String expected = "abc123";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail6() {
			UserDTO test = new UserDTO();
			String expected = "あいう１２３";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail7() {
			UserDTO test = new UserDTO();
			String expected = "abc123あいう１２３";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#getEmail()}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testGetEmail8() {
			UserDTO test = new UserDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail1() {
			UserDTO test = new UserDTO();
			String expected = null;

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail2() {
			UserDTO test = new UserDTO();
			String expected = "";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail3() {
			UserDTO test = new UserDTO();
			String expected = " ";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail4() {
			UserDTO test = new UserDTO();
			String expected = "　";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail5() {
			UserDTO test = new UserDTO();
			String expected = "abc123";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail6() {
			UserDTO test = new UserDTO();
			String expected = "あいう１２３";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail7() {
			UserDTO test = new UserDTO();
			String expected = "abc123あいう１２３";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}

		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#setEmail(java.lang.String)}
		 * のためのテスト・メソッド。
		 */
		@Test
		public void testSetEmail8() {
			UserDTO test = new UserDTO();
			String expected = "ａｂｃ１２３あいう漢字";

			test.setEmail(expected);
			String actual = test.getEmail();

			assertEquals(expected, actual);

		}
		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#isLoginFlg()}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testLoginFlg1() {
			UserDTO test = new UserDTO();
			boolean expected = true;

			test.setLoginFlg(expected);
			boolean actual=test.getLoginFlg();
			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#isLoginFlg()}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testLoginFlg2() {
			UserDTO test = new UserDTO();
			boolean expected = false;

			test.setLoginFlg(expected);
			boolean actual=test.getLoginFlg();
			assertEquals(expected, actual);
		}



		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#setLoginFlg(boolean)}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testSetLoginFlg1() {
			UserDTO test = new UserDTO();
			boolean expected = true;

			test.setLoginFlg(expected);
			boolean actual=test.getLoginFlg();
			assertEquals(expected, actual);
		}

		/**
		 * {@link com.internousdev.tamaya.dto.UserDTO#setLoginFlg(boolean)}
		 *  のためのテスト・メソッド。
		 */
		@Test
		public void testSetLoginFlg2() {
			UserDTO test = new UserDTO();
			boolean expected = false;

			test.setLoginFlg(expected);
			boolean actual=test.getLoginFlg();
			assertEquals(expected, actual);
		}

}


