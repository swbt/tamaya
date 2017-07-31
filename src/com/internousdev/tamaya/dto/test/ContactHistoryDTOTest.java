/**
 *
 */
package com.internousdev.tamaya.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.tamaya.dto.ContactHistoryDTO;

/**
 * クレジット情報履歴に関するDTOクラス
 *
 * @author YUKO TSUJI
 * @since 1.0
 */






public class ContactHistoryDTOTest {

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName1() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "null";
		test.setUserName(expected);
		String actual = test.getUserName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName2() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "";
		test.setUserName(expected);
		String actual = test.getUserName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName3() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = " ";
		test.setUserName(expected);
		String actual = test.getUserName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName4() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "　";
		test.setUserName(expected);
		String actual = test.getUserName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName5() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "abc123";
		test.setUserName(expected);
		String actual = test.getUserName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName6() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "あいう１２３";
		test.setUserName(expected);
		String actual = test.getUserName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName7() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "abc123あいう１２３";
		test.setUserName(expected);
		String actual = test.getUserName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getUserName()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetUserName8() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setUserName(expected);
		String actual = test.getUserName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setUserName(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName1() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "null";
		test.setUserName(expected);
		String actual = test.getUserName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setUserName(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName2() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "";
		test.setUserName(expected);
		String actual = test.getUserName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setUserName(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName3() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = " ";
		test.setUserName(expected);
		String actual = test.getUserName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setUserName(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName4() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "　";
		test.setUserName(expected);
		String actual = test.getUserName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setUserName(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName5() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "abc123";
		test.setUserName(expected);
		String actual = test.getUserName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setUserName(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName6() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "あいう１２３";
		test.setUserName(expected);
		String actual = test.getUserName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setUserName(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName7() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "abc123あいう１２３";
		test.setUserName(expected);
		String actual = test.getUserName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setUserName(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetUserName8() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setUserName(expected);
		String actual = test.getUserName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail1() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "null";
		test.setEmail(expected);
		String actual = test.getEmail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail2() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "";
		test.setEmail(expected);
		String actual = test.getEmail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail3() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = " ";
		test.setEmail(expected);
		String actual = test.getEmail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail4() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "　";
		test.setEmail(expected);
		String actual = test.getEmail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail5() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "abc123";
		test.setEmail(expected);
		String actual = test.getEmail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail6() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "あいう１２３";
		test.setEmail(expected);
		String actual = test.getEmail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail7() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "abc123あいう１２３";
		test.setEmail(expected);
		String actual = test.getEmail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getEmail()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetEmail8() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setEmail(expected);
		String actual = test.getEmail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setEmail(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail1() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "null";
		test.setEmail(expected);
		String actual = test.getEmail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setEmail(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail2() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "";
		test.setEmail(expected);
		String actual = test.getEmail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setEmail(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail3() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = " ";
		test.setEmail(expected);
		String actual = test.getEmail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setEmail(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail4() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "　";
		test.setEmail(expected);
		String actual = test.getEmail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setEmail(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail5() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "abc123";
		test.setEmail(expected);
		String actual = test.getEmail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setEmail(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail6() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "あいう１２３";
		test.setEmail(expected);
		String actual = test.getEmail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setEmail(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail7() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "abc123あいう１２３";
		test.setEmail(expected);
		String actual = test.getEmail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setEmail(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetEmail8() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setEmail(expected);
		String actual = test.getEmail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getComment()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetComment1() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "null";
		test.setComment(expected);
		String actual = test.getComment();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getComment()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetComment2() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "";
		test.setComment(expected);
		String actual = test.getComment();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getComment()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetComment3() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = " ";
		test.setComment(expected);
		String actual = test.getComment();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getComment()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetComment4() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "　";
		test.setComment(expected);
		String actual = test.getComment();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getComment()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetComment5() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "abc123";
		test.setComment(expected);
		String actual = test.getComment();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getComment()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetComment6() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "あいう１２３";
		test.setComment(expected);
		String actual = test.getComment();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getComment()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetComment7() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "abc123あいう１２３";
		test.setComment(expected);
		String actual = test.getComment();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getComment()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetComment8() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setComment(expected);
		String actual = test.getComment();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setComment(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetComment1() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "null";
		test.setComment(expected);
		String actual = test.getComment();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setComment(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetComment2() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "";
		test.setComment(expected);
		String actual = test.getComment();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setComment(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetComment3() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = " ";
		test.setComment(expected);
		String actual = test.getComment();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setComment(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetComment4() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "　";
		test.setComment(expected);
		String actual = test.getComment();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setComment(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetComment5() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "abc123";
		test.setComment(expected);
		String actual = test.getComment();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setComment(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetComment6() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "あいう１２３";
		test.setComment(expected);
		String actual = test.getComment();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setComment(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetComment7() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "abc123あいう１２３";
		test.setComment(expected);
		String actual = test.getComment();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setComment(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetComment8() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setComment(expected);
		String actual = test.getComment();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getDt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetDt1() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "null";
		test.setDt(expected);
		String actual = test.getDt();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getDt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetDt2() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "";
		test.setDt(expected);
		String actual = test.getDt();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getDt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetDt3() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = " ";
		test.setDt(expected);
		String actual = test.getDt();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getDt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetDt4() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "　";
		test.setDt(expected);
		String actual = test.getDt();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getDt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetDt5() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "abc123";
		test.setDt(expected);
		String actual = test.getDt();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getDt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetDt6() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "あいう１２３";
		test.setDt(expected);
		String actual = test.getDt();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getDt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetDt7() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "abc123あいう１２３";
		test.setDt(expected);
		String actual = test.getDt();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#getDt()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetDt8() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setDt(expected);
		String actual = test.getDt();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setDt(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetDt1() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "null";
		test.setDt(expected);
		String actual = test.getDt();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setDt(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetDt2() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "";
		test.setDt(expected);
		String actual = test.getDt();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setDt(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetDt3() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = " ";
		test.setDt(expected);
		String actual = test.getDt();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setDt(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetDt4() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "　";
		test.setDt(expected);
		String actual = test.getDt();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setDt(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetDt5() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "abc123";
		test.setDt(expected);
		String actual = test.getDt();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setDt(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetDt6() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "あいう１２３";
		test.setDt(expected);
		String actual = test.getDt();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setDt(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetDt7() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "abc123あいう１２３";
		test.setDt(expected);
		String actual = test.getDt();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ContactHistoryDTO#setDt(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetDt8() {
		ContactHistoryDTO test = new ContactHistoryDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setDt(expected);
		String actual = test.getDt();
		assertEquals(expected, actual);
	}

}
