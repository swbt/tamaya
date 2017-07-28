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


	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getShippingCost()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetShippingCost1() {
		CartDTO test = new CartDTO();
		BigDecimal expected = new BigDecimal("0");
		test.setShippingCost(expected);
		assertEquals(expected, test.getShippingCost());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getShippingCost()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetShippingCost2() {
		CartDTO test = new CartDTO();
		BigDecimal expected = new BigDecimal("1.0E20");
		test.setShippingCost(expected);
		assertEquals(expected, test.getShippingCost());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getShippingCost()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetShippingCost3() {
		CartDTO test = new CartDTO();
		BigDecimal expected = new BigDecimal("-1.0E20");
		test.setShippingCost(expected);
		assertEquals(expected, test.getShippingCost());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getShippingCost()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetShippingCost4() {
		CartDTO test = new CartDTO();
		BigDecimal expected = new BigDecimal("1.0E-20");
		test.setShippingCost(expected);
		assertEquals(expected, test.getShippingCost());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.CartDTO#getShippingCost()}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testGetShippingCost5() {
		CartDTO test = new CartDTO();
		BigDecimal expected = new BigDecimal("-1.0E-20");
		test.setShippingCost(expected);
		assertEquals(expected, test.getShippingCost());
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.CartDTO#setShippingCost(BigDecimal)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetShippingCost1() {
		CartDTO test = new CartDTO();
		BigDecimal expected = new BigDecimal("0");
		test.setShippingCost(expected);
		BigDecimal actual = test.getShippingCost();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.CartDTO#setShippingCost(BigDecimal)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetShippingCost2() {
		CartDTO test = new CartDTO();
		BigDecimal expected = new BigDecimal("1.0E20");
		test.setShippingCost(expected);
		BigDecimal actual = test.getShippingCost();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.CartDTO#setShippingCost(BigDecimal)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetShippingCost3() {
		CartDTO test = new CartDTO();
		BigDecimal expected = new BigDecimal("-1.0E20");
		test.setShippingCost(expected);
		BigDecimal actual = test.getShippingCost();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.CartDTO#setShippingCost(BigDecimal)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetShippingCost4() {
		CartDTO test = new CartDTO();
		BigDecimal expected = new BigDecimal("1.0E-20");
		test.setShippingCost(expected);
		BigDecimal actual = test.getShippingCost();
		assertEquals(expected, actual);
	}

	/**
	 * {@link com.internousdev.tamaya.dto.dto.CartDTO#setShippingCost(BigDecimal)}
	 * のためのテスト・メソッド。
	 */
	@Test
	public void testSetShippingCost5() {
		CartDTO test = new CartDTO();
		BigDecimal expected = new BigDecimal("-1.0E-20");
		test.setShippingCost(expected);
		BigDecimal actual = test.getShippingCost();
		assertEquals(expected, actual);
	}

}
