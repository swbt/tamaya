/**
 *
 */
package com.internousdev.tamaya.dto.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

/**
 * 商品に関する情報をここに入れて運ぶ
 *
 * @author Takahiro Adachi
 * @since 1.0
 * @version 1.0
 */
public class ItemDTOTest {
	/** {@link com.internousdev.tamaya.dto.ItemDTO#getItemId()} のためのテスト・メソッド。 */
	@Test
	public void testGetItemId1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;
		test.setItemId(expected);
		assertEquals(expected, test.getItemId());
	}

	/** {@link com.internousdev.tamaya.dto.ItemDTO#getItemId()} のためのテスト・メソッド。 */
	@Test
	public void testGetItemId2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;
		test.setItemId(expected);
		assertEquals(expected, test.getItemId());
	}

	/** {@link com.internousdev.tamaya.dto.ItemDTO#getItemId()} のためのテスト・メソッド。 */
	@Test
	public void testGetItemId3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;
		test.setItemId(expected);
		assertEquals(expected, test.getItemId());
	}

	/** {@link com.internousdev.tamaya.dto.ItemDTO#getItemId()} のためのテスト・メソッド。 */
	@Test
	public void testGetItemId4() {
		ItemDTO test = new ItemDTO();
		try {
			int outOfRange = Integer.parseInt("2147483648");
			test.setItemId(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/** {@link com.internousdev.tamaya.dto.ItemDTO#getItemId()} のためのテスト・メソッド。 */
	@Test
	public void testGetItemId5() {
		ItemDTO test = new ItemDTO();
		try {
			int outOfRange = Integer.parseInt("-2147483649");
			test.setItemId(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setItemId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;
		test.setItemId(expected);
		int actual = test.getItemId();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setItemId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;
		test.setItemId(expected);
		int actual = test.getItemId();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setItemId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;
		test.setItemId(expected);
		int actual = test.getItemId();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setItemId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId4() {
		ItemDTO test = new ItemDTO();
		try {
			int outOfRange = Integer.parseInt("2147483648");
			test.setItemId(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setItemId(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemId5() {
		ItemDTO test = new ItemDTO();
		try {
			int outOfRange = Integer.parseInt("-2147483649");
			test.setItemId(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/** {@link com.internousdev.tamaya.dto.ItemDTO#getStocks()} のためのテスト・メソッド。 */
	@Test
	public void testGetStocks1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;
		test.setStocks(expected);
		assertEquals(expected, test.getStocks());
	}

	/** {@link com.internousdev.tamaya.dto.ItemDTO#getStocks()} のためのテスト・メソッド。 */
	@Test
	public void testGetStocks2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;
		test.setStocks(expected);
		assertEquals(expected, test.getStocks());
	}

	/** {@link com.internousdev.tamaya.dto.ItemDTO#getStocks()} のためのテスト・メソッド。 */
	@Test
	public void testGetStocks3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;
		test.setStocks(expected);
		assertEquals(expected, test.getStocks());
	}

	/** {@link com.internousdev.tamaya.dto.ItemDTO#getStocks()} のためのテスト・メソッド。 */
	@Test
	public void testGetStocks4() {
		ItemDTO test = new ItemDTO();
		try {
			int outOfRange = Integer.parseInt("2147483648");
			test.setStocks(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/** {@link com.internousdev.tamaya.dto.ItemDTO#getStocks()} のためのテスト・メソッド。 */
	@Test
	public void testGetStocks5() {
		ItemDTO test = new ItemDTO();
		try {
			int outOfRange = Integer.parseInt("-2147483649");
			test.setStocks(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setStocks(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetStocks1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;
		test.setStocks(expected);
		int actual = test.getStocks();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setStocks(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetStocks2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;
		test.setStocks(expected);
		int actual = test.getStocks();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setStocks(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetStocks3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;
		test.setStocks(expected);
		int actual = test.getStocks();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setStocks(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetStocks4() {
		ItemDTO test = new ItemDTO();
		try {
			int outOfRange = Integer.parseInt("2147483648");
			test.setStocks(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setStocks(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetStocks5() {
		ItemDTO test = new ItemDTO();
		try {
			int outOfRange = Integer.parseInt("-2147483649");
			test.setStocks(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/** {@link com.internousdev.tamaya.dto.ItemDTO#getSales()} のためのテスト・メソッド。 */
	@Test
	public void testGetSales1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;
		test.setSales(expected);
		assertEquals(expected, test.getSales());
	}

	/** {@link com.internousdev.tamaya.dto.ItemDTO#getSales()} のためのテスト・メソッド。 */
	@Test
	public void testGetSales2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;
		test.setSales(expected);
		assertEquals(expected, test.getSales());
	}

	/** {@link com.internousdev.tamaya.dto.ItemDTO#getSales()} のためのテスト・メソッド。 */
	@Test
	public void testGetSales3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;
		test.setSales(expected);
		assertEquals(expected, test.getSales());
	}

	/** {@link com.internousdev.tamaya.dto.ItemDTO#getSales()} のためのテスト・メソッド。 */
	@Test
	public void testGetSales4() {
		ItemDTO test = new ItemDTO();
		try {
			int outOfRange = Integer.parseInt("2147483648");
			test.setSales(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/** {@link com.internousdev.tamaya.dto.ItemDTO#getSales()} のためのテスト・メソッド。 */
	@Test
	public void testGetSales5() {
		ItemDTO test = new ItemDTO();
		try {
			int outOfRange = Integer.parseInt("-2147483649");
			test.setSales(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setSales(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSales1() {
		ItemDTO test = new ItemDTO();
		int expected = 0;
		test.setSales(expected);
		int actual = test.getSales();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setSales(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSales2() {
		ItemDTO test = new ItemDTO();
		int expected = 2147483647;
		test.setSales(expected);
		int actual = test.getSales();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setSales(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSales3() {
		ItemDTO test = new ItemDTO();
		int expected = -2147483648;
		test.setSales(expected);
		int actual = test.getSales();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setSales(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSales4() {
		ItemDTO test = new ItemDTO();
		try {
			int outOfRange = Integer.parseInt("2147483648");
			test.setSales(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setSales(int)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetSales5() {
		ItemDTO test = new ItemDTO();
		try {
			int outOfRange = Integer.parseInt("-2147483649");
			test.setSales(outOfRange);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName1() {
		ItemDTO test = new ItemDTO();
		String expected = "null";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName2() {
		ItemDTO test = new ItemDTO();
		String expected = "";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getItemName()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemName8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setItemName(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName1() {
		ItemDTO test = new ItemDTO();
		String expected = "null";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setItemName(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName2() {
		ItemDTO test = new ItemDTO();
		String expected = "";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setItemName(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setItemName(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setItemName(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setItemName(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setItemName(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setItemName(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemName8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setItemName(expected);
		String actual = test.getItemName();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategory1() {
		ItemDTO test = new ItemDTO();
		String expected = "null";
		test.setCategory(expected);
		String actual = test.getCategory();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategory2() {
		ItemDTO test = new ItemDTO();
		String expected = "";
		test.setCategory(expected);
		String actual = test.getCategory();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategory3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";
		test.setCategory(expected);
		String actual = test.getCategory();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategory4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";
		test.setCategory(expected);
		String actual = test.getCategory();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategory5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";
		test.setCategory(expected);
		String actual = test.getCategory();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategory6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";
		test.setCategory(expected);
		String actual = test.getCategory();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategory7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";
		test.setCategory(expected);
		String actual = test.getCategory();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getCategory()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetCategory8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setCategory(expected);
		String actual = test.getCategory();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setCategory(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategory1() {
		ItemDTO test = new ItemDTO();
		String expected = "null";
		test.setCategory(expected);
		String actual = test.getCategory();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setCategory(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategory2() {
		ItemDTO test = new ItemDTO();
		String expected = "";
		test.setCategory(expected);
		String actual = test.getCategory();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setCategory(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategory3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";
		test.setCategory(expected);
		String actual = test.getCategory();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setCategory(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategory4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";
		test.setCategory(expected);
		String actual = test.getCategory();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setCategory(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategory5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";
		test.setCategory(expected);
		String actual = test.getCategory();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setCategory(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategory6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";
		test.setCategory(expected);
		String actual = test.getCategory();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setCategory(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategory7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";
		test.setCategory(expected);
		String actual = test.getCategory();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setCategory(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetCategory8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setCategory(expected);
		String actual = test.getCategory();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getItemDetail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemDetail1() {
		ItemDTO test = new ItemDTO();
		String expected = "null";
		test.setItemDetail(expected);
		String actual = test.getItemDetail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getItemDetail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemDetail2() {
		ItemDTO test = new ItemDTO();
		String expected = "";
		test.setItemDetail(expected);
		String actual = test.getItemDetail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getItemDetail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemDetail3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";
		test.setItemDetail(expected);
		String actual = test.getItemDetail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getItemDetail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemDetail4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";
		test.setItemDetail(expected);
		String actual = test.getItemDetail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getItemDetail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemDetail5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";
		test.setItemDetail(expected);
		String actual = test.getItemDetail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getItemDetail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemDetail6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";
		test.setItemDetail(expected);
		String actual = test.getItemDetail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getItemDetail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemDetail7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";
		test.setItemDetail(expected);
		String actual = test.getItemDetail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getItemDetail()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetItemDetail8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setItemDetail(expected);
		String actual = test.getItemDetail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setItemDetail(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemDetail1() {
		ItemDTO test = new ItemDTO();
		String expected = "null";
		test.setItemDetail(expected);
		String actual = test.getItemDetail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setItemDetail(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemDetail2() {
		ItemDTO test = new ItemDTO();
		String expected = "";
		test.setItemDetail(expected);
		String actual = test.getItemDetail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setItemDetail(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemDetail3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";
		test.setItemDetail(expected);
		String actual = test.getItemDetail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setItemDetail(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemDetail4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";
		test.setItemDetail(expected);
		String actual = test.getItemDetail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setItemDetail(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemDetail5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";
		test.setItemDetail(expected);
		String actual = test.getItemDetail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setItemDetail(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemDetail6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";
		test.setItemDetail(expected);
		String actual = test.getItemDetail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setItemDetail(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemDetail7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";
		test.setItemDetail(expected);
		String actual = test.getItemDetail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setItemDetail(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetItemDetail8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setItemDetail(expected);
		String actual = test.getItemDetail();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath1() {
		ItemDTO test = new ItemDTO();
		String expected = "null";
		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath2() {
		ItemDTO test = new ItemDTO();
		String expected = "";
		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";
		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";
		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";
		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";
		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";
		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getImgPath()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetImgPath8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setImgPath(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath1() {
		ItemDTO test = new ItemDTO();
		String expected = "null";
		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setImgPath(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath2() {
		ItemDTO test = new ItemDTO();
		String expected = "";
		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setImgPath(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath3() {
		ItemDTO test = new ItemDTO();
		String expected = " ";
		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setImgPath(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath4() {
		ItemDTO test = new ItemDTO();
		String expected = "　";
		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setImgPath(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath5() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123";
		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setImgPath(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath6() {
		ItemDTO test = new ItemDTO();
		String expected = "あいう１２３";
		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setImgPath(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath7() {
		ItemDTO test = new ItemDTO();
		String expected = "abc123あいう１２３";
		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#setImgPath(String)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetImgPath8() {
		ItemDTO test = new ItemDTO();
		String expected = "ａｂｃ１２３あいう漢字";
		test.setImgPath(expected);
		String actual = test.getImgPath();
		assertEquals(expected, actual);
	}

	/** {@link com.internousdev.tamaya.dto.ItemDTO#getBasePrice()} のためのテスト・メソッド。 */
	@Test
	public void testGetPrice1() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("0");
		test.setPrice(expected);
		assertEquals(expected, test.getPrice());
	}

	/** {@link com.internousdev.tamaya.dto.ItemDTO#getBasePrice()} のためのテスト・メソッド。 */
	@Test
	public void testGetPrice2() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("1.0E20");
		test.setPrice(expected);
		assertEquals(expected, test.getPrice());
	}

	/** {@link com.internousdev.tamaya.dto.ItemDTO#getBasePrice()} のためのテスト・メソッド。 */
	@Test
	public void testGetPrice3() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("-1.0E20");
		test.setPrice(expected);
		assertEquals(expected, test.getPrice());
	}

	/** {@link com.internousdev.tamaya.dto.ItemDTO#getBasePrice()} のためのテスト・メソッド。 */
	@Test
	public void testGetPrice4() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("1.0E-20");
		test.setPrice(expected);
		assertEquals(expected, test.getPrice());
	}

	/** {@link com.internousdev.tamaya.dto.ItemDTO#getBasePrice()} のためのテスト・メソッド。 */
	@Test
	public void testGetPrice5() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("-1.0E-20");
		test.setPrice(expected);
		assertEquals(expected, test.getPrice());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setBasePrice(BigDecimal)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice1() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("0");
		test.setPrice(expected);
		BigDecimal actual = test.getPrice();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setBasePrice(BigDecimal)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice2() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("1.0E20");
		test.setPrice(expected);
		BigDecimal actual = test.getPrice();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setBasePrice(BigDecimal)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice3() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("-1.0E20");
		test.setPrice(expected);
		BigDecimal actual = test.getPrice();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setBasePrice(BigDecimal)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice4() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("1.0E-20");
		test.setPrice(expected);
		BigDecimal actual = test.getPrice();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setBasePrice(BigDecimal)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPrice5() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("-1.0E-20");
		test.setPrice(expected);
		BigDecimal actual = test.getPrice();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getTaxRate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTaxRate1() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("0");
		test.setTaxRate(expected);
		assertEquals(expected, test.getTaxRate());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getTaxRate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTaxRate2() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("1.0E20");
		test.setTaxRate(expected);
		assertEquals(expected, test.getTaxRate());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getTaxRate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTaxRate3() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("-1.0E20");
		test.setTaxRate(expected);
		assertEquals(expected, test.getTaxRate());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getTaxRate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTaxRate4() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("1.0E-20");
		test.setTaxRate(expected);
		assertEquals(expected, test.getTaxRate());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getTaxRate()} のためのテスト・メソッド。
	 */
	@Test
	public void testGetTaxRate5() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("-1.0E-20");
		test.setTaxRate(expected);
		assertEquals(expected, test.getTaxRate());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setTaxRate(BigDecimal)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetTaxRate1() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("0");
		test.setTaxRate(expected);
		BigDecimal actual = test.getTaxRate();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setTaxRate(BigDecimal)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetTaxRate2() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("1.0E20");
		test.setTaxRate(expected);
		BigDecimal actual = test.getTaxRate();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setTaxRate(BigDecimal)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetTaxRate3() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("-1.0E20");
		test.setTaxRate(expected);
		BigDecimal actual = test.getTaxRate();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setTaxRate(BigDecimal)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetTaxRate4() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("1.0E-20");
		test.setTaxRate(expected);
		BigDecimal actual = test.getTaxRate();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setTaxRate(BigDecimal)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetTaxRate5() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("-1.0E-20");
		test.setTaxRate(expected);
		BigDecimal actual = test.getTaxRate();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getPriceWithTax()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPriceWithTax1() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("0");
		test.setPriceWithTax(expected);
		assertEquals(expected, test.getPriceWithTax());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getPriceWithTax()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPriceWithTax2() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("1.0E20");
		test.setPriceWithTax(expected);
		assertEquals(expected, test.getPriceWithTax());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getPriceWithTax()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPriceWithTax3() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("-1.0E20");
		test.setPriceWithTax(expected);
		assertEquals(expected, test.getPriceWithTax());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getPriceWithTax()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPriceWithTax4() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("1.0E-20");
		test.setPriceWithTax(expected);
		assertEquals(expected, test.getPriceWithTax());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.ItemDTO#getPriceWithTax()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetPriceWithTax5() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("-1.0E-20");
		test.setPriceWithTax(expected);
		assertEquals(expected, test.getPriceWithTax());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setPriceWithTax(BigDecimal)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPriceWithTax1() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("0");
		test.setPriceWithTax(expected);
		BigDecimal actual = test.getPriceWithTax();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setPriceWithTax(BigDecimal)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPriceWithTax2() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("1.0E20");
		test.setPriceWithTax(expected);
		BigDecimal actual = test.getPriceWithTax();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setPriceWithTax(BigDecimal)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPriceWithTax3() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("-1.0E20");
		test.setPriceWithTax(expected);
		BigDecimal actual = test.getPriceWithTax();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setPriceWithTax(BigDecimal)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPriceWithTax4() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("1.0E-20");
		test.setPriceWithTax(expected);
		BigDecimal actual = test.getPriceWithTax();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.ItemDTO#setPriceWithTax(BigDecimal)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetPriceWithTax5() {
		ItemDTO test = new ItemDTO();
		BigDecimal expected = new BigDecimal("-1.0E-20");
		test.setPriceWithTax(expected);
		BigDecimal actual = test.getPriceWithTax();
		assertEquals(expected, actual);
	}

}
