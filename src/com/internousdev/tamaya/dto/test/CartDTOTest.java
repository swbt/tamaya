/**
 *
 */
package com.internousdev.tamaya.dto.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import com.internousdev.tamaya.dto.CartDTO;

/**
 * @author voidernousdev
 *
 */
public class CartDTOTest {

/*	private int userId;			//ユーザーID

	private int ItemId;			//商品ID

	private String itemName;		//商品名

	private int price;		//単価

	private int quantity;			//数量

	private String imgPath;			//イメージパス

	private int subtotal;		//小計
*/

	//以下アクセサリー

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetuserId1() {
		CartDTO test = new CartDTO();
		int expected = 0;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetuserId2() {
		CartDTO test = new CartDTO();
		int expected = 2147483647;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetuserId3() {
		CartDTO test = new CartDTO();
		int expected = -2147483648;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetuserId4() {
		CartDTO test = new CartDTO();
		try {
			int Purchase_idMin = Integer.parseInt("2147483648");
			test.setUserId(Purchase_idMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetuserId5() {
		CartDTO test = new CartDTO();
		try {
			int Purchase_idMin = Integer.parseInt("-2147483649");
			test.setUserId(Purchase_idMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetuserId1() {
		CartDTO test = new CartDTO();
		int expected = 0;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetuserId2() {
		CartDTO test = new CartDTO();
		int expected = 2147483647;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetuserId3() {
		CartDTO test = new CartDTO();
		int expected = -2147483648;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetuserId4() {
		CartDTO test = new CartDTO();
		try {
			int Purchase_idMax = Integer.parseInt("2147483648");
			test.setUserId(Purchase_idMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetuserId5() {
		CartDTO test = new CartDTO();
		try {
			int Purchase_idMax = Integer.parseInt("-2147483649");
			test.setUserId(Purchase_idMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}









	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetitemName1() {
		CartDTO test = new CartDTO();
		String expected = null;

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetitemName2() {
		CartDTO test = new CartDTO();
		String expected = "";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetitemName3() {
		CartDTO test = new CartDTO();
		String expected = " ";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetitemName4() {
		CartDTO test = new CartDTO();
		String expected = "　";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetitemName5() {
		CartDTO test = new CartDTO();
		String expected = "abc123";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetitemName6() {
		CartDTO test = new CartDTO();
		String expected = "あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetitemName7() {
		CartDTO test = new CartDTO();
		String expected = "abc123あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetitemName8() {
		CartDTO test = new CartDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setitemId(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId1() {
		CartDTO test = new CartDTO();
		String expected = null;

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setitemId(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId2() {
		CartDTO test = new CartDTO();
		String expected = "";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setitemId(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId3() {
		CartDTO test = new CartDTO();
		String expected = " ";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setitemId(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId4() {
		CartDTO test = new CartDTO();
		String expected = "　";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setitemId(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId5() {
		CartDTO test = new CartDTO();
		String expected = "abc123";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setitemId(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId6() {
		CartDTO test = new CartDTO();
		String expected = "あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setitemId(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId7() {
		CartDTO test = new CartDTO();
		String expected = "abc123あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setitemId(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId8() {
		CartDTO test = new CartDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}







/*	BigDecimal bd = BigDecimal.valueOf(0);*/

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice1() {
		CartDTO test = new CartDTO();
		BigDecimal expected =  BigDecimal.valueOf(0);

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice2() {
		CartDTO test = new CartDTO();
		BigDecimal expected =  BigDecimal.valueOf(1000000000);
		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getPrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice3() {
		CartDTO test = new CartDTO();
		BigDecimal expected =  BigDecimal.valueOf(-12651651);

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice4() {
		CartDTO test = new CartDTO();
		try {
			BigDecimal expected =  BigDecimal.valueOf(4.4028235E38);
			test.setPrice(expected);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice5() {
		CartDTO test = new CartDTO();
		try {
			BigDecimal expected =  BigDecimal.valueOf(-4.4028235E38);
			test.setPrice(expected);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice1() {
		CartDTO test = new CartDTO();
		BigDecimal expected =  BigDecimal.valueOf(0);
		test.setPrice(expected);

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice2() {
		CartDTO test = new CartDTO();
		BigDecimal expected =  BigDecimal.valueOf(0.00000000001f);

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice3() {
		CartDTO test = new CartDTO();
		BigDecimal expected =  BigDecimal.valueOf(-151545151);

		test.setPrice(expected);

		assertEquals(expected, test.getPrice());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice4() {
		CartDTO test = new CartDTO();
		try {
			BigDecimal expected =  BigDecimal.valueOf(4.4028235E38);
			test.setPrice(expected);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setPrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice5() {
		CartDTO test = new CartDTO();
		try {
			BigDecimal expected =  BigDecimal.valueOf(-4.4028235E38);
			test.setPrice(expected);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38\"");
		}
	}








	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetImgPath1() {
		CartDTO test = new CartDTO();
		String expected = null;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetImgPath2() {
		CartDTO test = new CartDTO();
		String expected = "";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetImgPath3() {
		CartDTO test = new CartDTO();
		String expected = " ";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetImgPath4() {
		CartDTO test = new CartDTO();
		String expected = "　";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetImgPath5() {
		CartDTO test = new CartDTO();
		String expected = "abc123";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetImgPath6() {
		CartDTO test = new CartDTO();
		String expected = "あいう１２３";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetImgPath7() {
		CartDTO test = new CartDTO();
		String expected = "abc123あいう１２３";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetImgPath8() {
		CartDTO test = new CartDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/*	BigDecimal bd = BigDecimal.valueOf(0);*/

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal1() {
		CartDTO test = new CartDTO();
		BigDecimal expected =  BigDecimal.valueOf(0);

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal2() {
		CartDTO test = new CartDTO();
		BigDecimal expected =  BigDecimal.valueOf(1000000000);
		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal3() {
		CartDTO test = new CartDTO();
		BigDecimal expected =  BigDecimal.valueOf(-12651651);

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal4() {
		CartDTO test = new CartDTO();
		try {
			BigDecimal expected =  BigDecimal.valueOf(4.4028235E38);
			test.setSubtotal(expected);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getSubtotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal5() {
		CartDTO test = new CartDTO();
		try {
			BigDecimal expected =  BigDecimal.valueOf(-4.4028235E38);
			test.setSubtotal(expected);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setSubtotal(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetSubtotal1() {
		CartDTO test = new CartDTO();
		BigDecimal expected =  BigDecimal.valueOf(0);
		test.setSubtotal(expected);

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setSubtotal(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetSubtotal2() {
		CartDTO test = new CartDTO();
		BigDecimal expected =  BigDecimal.valueOf(0.00000000001f);

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setSubtotal(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetSubtotal3() {
		CartDTO test = new CartDTO();
		BigDecimal expected =  BigDecimal.valueOf(-151545151);

		test.setSubtotal(expected);

		assertEquals(expected, test.getSubtotal());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setSubtotal(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetSubtotal4() {
		CartDTO test = new CartDTO();
		try {
			BigDecimal expected =  BigDecimal.valueOf(4.4028235E38);
			test.setSubtotal(expected);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#setSubtotal(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetSubtotal5() {
		CartDTO test = new CartDTO();
		try {
			BigDecimal expected =  BigDecimal.valueOf(-4.4028235E38);
			test.setSubtotal(expected);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38\"");
		}
	}









}
