/**
 *
 */
package com.internousdev.tamaya.dto.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import com.internousdev.tamaya.dto.CartItemDTO;

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
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetuserId1() {
		CartItemDTO test = new CartItemDTO();
		int expected = 0;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetuserId2() {
		CartItemDTO test = new CartItemDTO();
		int expected = 2147483647;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetuserId3() {
		CartItemDTO test = new CartItemDTO();
		int expected = -2147483648;

		test.setUserId(expected);

		assertEquals(expected, test.getUserId());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetuserId4() {
		CartItemDTO test = new CartItemDTO();
		try {
			int Purchase_idMin = Integer.parseInt("2147483648");
			test.setUserId(Purchase_idMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getUserId()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetuserId5() {
		CartItemDTO test = new CartItemDTO();
		try {
			int Purchase_idMin = Integer.parseInt("-2147483649");
			test.setUserId(Purchase_idMin);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetuserId1() {
		CartItemDTO test = new CartItemDTO();
		int expected = 0;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}


	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetuserId2() {
		CartItemDTO test = new CartItemDTO();
		int expected = 2147483647;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetuserId3() {
		CartItemDTO test = new CartItemDTO();
		int expected = -2147483648;

		test.setUserId(expected);
		int actual = test.getUserId();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetuserId4() {
		CartItemDTO test = new CartItemDTO();
		try {
			int Purchase_idMax = Integer.parseInt("2147483648");
			test.setUserId(Purchase_idMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setUserId(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetuserId5() {
		CartItemDTO test = new CartItemDTO();
		try {
			int Purchase_idMax = Integer.parseInt("-2147483649");
			test.setUserId(Purchase_idMax);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}









	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetitemName1() {
		CartItemDTO test = new CartItemDTO();
		String expected = null;

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetitemName2() {
		CartItemDTO test = new CartItemDTO();
		String expected = "";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetitemName3() {
		CartItemDTO test = new CartItemDTO();
		String expected = " ";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetitemName4() {
		CartItemDTO test = new CartItemDTO();
		String expected = "　";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetitemName5() {
		CartItemDTO test = new CartItemDTO();
		String expected = "abc123";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetitemName6() {
		CartItemDTO test = new CartItemDTO();
		String expected = "あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetitemName7() {
		CartItemDTO test = new CartItemDTO();
		String expected = "abc123あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetitemName8() {
		CartItemDTO test = new CartItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setitemId(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId1() {
		CartItemDTO test = new CartItemDTO();
		String expected = null;

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setitemId(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId2() {
		CartItemDTO test = new CartItemDTO();
		String expected = "";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setitemId(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId3() {
		CartItemDTO test = new CartItemDTO();
		String expected = " ";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setitemId(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId4() {
		CartItemDTO test = new CartItemDTO();
		String expected = "　";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setitemId(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId5() {
		CartItemDTO test = new CartItemDTO();
		String expected = "abc123";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setitemId(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId6() {
		CartItemDTO test = new CartItemDTO();
		String expected = "あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setitemId(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId7() {
		CartItemDTO test = new CartItemDTO();
		String expected = "abc123あいう１２３";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setitemId(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId8() {
		CartItemDTO test = new CartItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setItemName(expected);
		String actual = test.getItemName();

		assertEquals(expected, actual);
	}







/*	BigDecimal bd = BigDecimal.valueOf(0);*/

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getTotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice1() {
		CartItemDTO test = new CartItemDTO();
		BigDecimal expected =  BigDecimal.valueOf(0);

		test.setBasePrice(expected);

		assertEquals(expected, test.getBasePrice());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getBasePrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice2() {
		CartItemDTO test = new CartItemDTO();
		BigDecimal expected =  BigDecimal.valueOf(1000000000);
		test.setBasePrice(expected);

		assertEquals(expected, test.getBasePrice());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getBasePrice()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice3() {
		CartItemDTO test = new CartItemDTO();
		BigDecimal expected =  BigDecimal.valueOf(-12651651);

		test.setBasePrice(expected);

		assertEquals(expected, test.getBasePrice());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getTotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice4() {
		CartItemDTO test = new CartItemDTO();
		try {
			BigDecimal expected =  BigDecimal.valueOf(4.4028235E38);
			test.setBasePrice(expected);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getTotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetPrice5() {
		CartItemDTO test = new CartItemDTO();
		try {
			BigDecimal expected =  BigDecimal.valueOf(-4.4028235E38);
			test.setBasePrice(expected);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setBasePrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice1() {
		CartItemDTO test = new CartItemDTO();
		BigDecimal expected =  BigDecimal.valueOf(0);
		test.setBasePrice(expected);

		test.setBasePrice(expected);

		assertEquals(expected, test.getBasePrice());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setBasePrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice2() {
		CartItemDTO test = new CartItemDTO();
		BigDecimal expected =  BigDecimal.valueOf(0.00000000001f);

		test.setBasePrice(expected);

		assertEquals(expected, test.getBasePrice());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setBasePrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice3() {
		CartItemDTO test = new CartItemDTO();
		BigDecimal expected =  BigDecimal.valueOf(-151545151);

		test.setBasePrice(expected);

		assertEquals(expected, test.getBasePrice());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setBasePrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice4() {
		CartItemDTO test = new CartItemDTO();
		try {
			BigDecimal expected =  BigDecimal.valueOf(4.4028235E38);
			test.setBasePrice(expected);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setBasePrice(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice5() {
		CartItemDTO test = new CartItemDTO();
		try {
			BigDecimal expected =  BigDecimal.valueOf(-4.4028235E38);
			test.setBasePrice(expected);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38\"");
		}
	}








	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetImgPath1() {
		CartItemDTO test = new CartItemDTO();
		String expected = null;

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetImgPath2() {
		CartItemDTO test = new CartItemDTO();
		String expected = "";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetImgPath3() {
		CartItemDTO test = new CartItemDTO();
		String expected = " ";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetImgPath4() {
		CartItemDTO test = new CartItemDTO();
		String expected = "　";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetImgPath5() {
		CartItemDTO test = new CartItemDTO();
		String expected = "abc123";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetImgPath6() {
		CartItemDTO test = new CartItemDTO();
		String expected = "あいう１２３";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetImgPath7() {
		CartItemDTO test = new CartItemDTO();
		String expected = "abc123あいう１２３";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testgetImgPath8() {
		CartItemDTO test = new CartItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";

		test.setImgPath(expected);
		String actual = test.getImgPath();

		assertEquals(expected, actual);
	}

	/*	BigDecimal bd = BigDecimal.valueOf(0);*/

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getTotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal1() {
		CartItemDTO test = new CartItemDTO();
		BigDecimal expected =  BigDecimal.valueOf(0);

		test.setSubtotal(expected);

		assertEquals(expected, test.getTotal());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getTotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal2() {
		CartItemDTO test = new CartItemDTO();
		BigDecimal expected =  BigDecimal.valueOf(1000000000);
		test.setSubtotal(expected);

		assertEquals(expected, test.getTotal());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getTotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal3() {
		CartItemDTO test = new CartItemDTO();
		BigDecimal expected =  BigDecimal.valueOf(-12651651);

		test.setSubtotal(expected);

		assertEquals(expected, test.getTotal());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getTotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal4() {
		CartItemDTO test = new CartItemDTO();
		try {
			BigDecimal expected =  BigDecimal.valueOf(4.4028235E38);
			test.setSubtotal(expected);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#getTotal()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetSubtotal5() {
		CartItemDTO test = new CartItemDTO();
		try {
			BigDecimal expected =  BigDecimal.valueOf(-4.4028235E38);
			test.setSubtotal(expected);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38f\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setSubtotal(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetSubtotal1() {
		CartItemDTO test = new CartItemDTO();
		BigDecimal expected =  BigDecimal.valueOf(0);
		test.setSubtotal(expected);

		test.setSubtotal(expected);

		assertEquals(expected, test.getTotal());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setSubtotal(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetSubtotal2() {
		CartItemDTO test = new CartItemDTO();
		BigDecimal expected =  BigDecimal.valueOf(0.00000000001f);

		test.setSubtotal(expected);

		assertEquals(expected, test.getTotal());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setSubtotal(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetSubtotal3() {
		CartItemDTO test = new CartItemDTO();
		BigDecimal expected =  BigDecimal.valueOf(-151545151);

		test.setSubtotal(expected);

		assertEquals(expected, test.getTotal());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setSubtotal(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetSubtotal4() {
		CartItemDTO test = new CartItemDTO();
		try {
			BigDecimal expected =  BigDecimal.valueOf(4.4028235E38);
			test.setSubtotal(expected);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"4.4028235E38\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartItemDTO#setSubtotal(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testsetSubtotal5() {
		CartItemDTO test = new CartItemDTO();
		try {
			BigDecimal expected =  BigDecimal.valueOf(-4.4028235E38);
			test.setSubtotal(expected);

		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-4.4028235E38\"");
		}
	}









}
