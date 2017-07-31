package com.internousdev.tamaya.dto.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.tamaya.dto.OrderDTO;

/**
 * OrderDTOをテストするクラス
 * @author YUKO TSUJI
 * @since 1.0
 *
 */




public class OrderDTOTest {
	/** {@link com.internousdev.tamaya.dto.OrderDTO#getOrderId()} のためのテスト・メソッド。 */
	@Test
	public void testGetOrderId1() {
	OrderDTO test = new OrderDTO();
	int expected = 0;
	test.setOrderId(expected);
	assertEquals(expected, test.getOrderId());
	}
	/** {@link com.internousdev.tamaya.dto.OrderDTO#getOrderId()} のためのテスト・メソッド。 */
	@Test
	public void testGetOrderId2() {
	OrderDTO test = new OrderDTO();
	int expected = 2147483647;
	test.setOrderId(expected);
	assertEquals(expected, test.getOrderId());
	}
	/** {@link com.internousdev.tamaya.dto.OrderDTO#getOrderId()} のためのテスト・メソッド。 */
	@Test
	public void testGetOrderId3() {
	OrderDTO test = new OrderDTO();
	int expected = -2147483648;
	test.setOrderId(expected);
	assertEquals(expected, test.getOrderId());
	}
	/** {@link com.internousdev.tamaya.dto.OrderDTO#getOrderId()} のためのテスト・メソッド。 */
	@Test
	public void testGetOrderId4() {
	OrderDTO test = new OrderDTO();
	try {
	int outOfRange = Integer.parseInt("2147483648");
	test.setOrderId(outOfRange);
	} catch (RuntimeException e) {
	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	}
	}
	/** {@link com.internousdev.tamaya.dto.OrderDTO#getOrderId()} のためのテスト・メソッド。 */
	@Test
	public void testGetOrderId5() {
	OrderDTO test = new OrderDTO();
	try {
	int outOfRange = Integer.parseInt("-2147483649");
	test.setOrderId(outOfRange);
	} catch (RuntimeException e) {
	assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
	}
	}
	/** {@link com.internousdev.tamaya.dto.dto.OrderDTO#setOrderId(int)} のためのテスト・メソッド。 */
	@Test
	public void testSetOrderId1() {
	OrderDTO test = new OrderDTO();
	int expected = 0;
	test.setOrderId(expected);
	int actual = test.getOrderId();
	assertEquals(expected, actual);
	}
	/** {@link com.internousdev.tamaya.dto.dto.OrderDTO#setOrderId(int)} のためのテスト・メソッド。 */
	@Test
	public void testSetOrderId2() {
	OrderDTO test = new OrderDTO();
	int expected = 2147483647;
	test.setOrderId(expected);
	int actual = test.getOrderId();
	assertEquals(expected, actual);
	}
	/** {@link com.internousdev.tamaya.dto.dto.OrderDTO#setOrderId(int)} のためのテスト・メソッド。 */
	@Test
	public void testSetOrderId3() {
	OrderDTO test = new OrderDTO();
	int expected = -2147483648;
	test.setOrderId(expected);
	int actual = test.getOrderId();
	assertEquals(expected, actual);
	}
	/** {@link com.internousdev.tamaya.dto.dto.OrderDTO#setOrderId(int)} のためのテスト・メソッド。 */
	@Test
	public void testSetOrderId4() {
	OrderDTO test = new OrderDTO();
	try {
	int outOfRange = Integer.parseInt("2147483648");
	test.setOrderId(outOfRange);
	} catch (RuntimeException e) {
	assertEquals(e.getMessage(), "For input string: \"2147483648\"");
	}
	}
	/** {@link com.internousdev.tamaya.dto.dto.OrderDTO#setOrderId(int)} のためのテスト・メソッド。 */
	@Test
	public void testSetOrderId5() {
	OrderDTO test = new OrderDTO();
	try {
	int outOfRange = Integer.parseInt("-2147483649");
	test.setOrderId(outOfRange);
	} catch (RuntimeException e) {
	assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
	}
	}

	/** {@link com.internousdev.tamaya.dto.OrderDTO#getShippingCost()} のためのテスト・メソッド。 */
	@Test
	public void testGetShippingCost1() {
	OrderDTO test = new OrderDTO();
	BigDecimal expected = new BigDecimal("0");
	test.setShippingCost(expected);
	assertEquals(expected.setScale(0, RoundingMode.HALF_EVEN), test.getShippingCost());
	}
	/** {@link com.internousdev.tamaya.dto.OrderDTO#getShippingCost()} のためのテスト・メソッド。 */
	@Test
	public void testGetShippingCost2() {
	OrderDTO test = new OrderDTO();
	BigDecimal expected = new BigDecimal("1.0E20");
	test.setShippingCost(expected);
	assertEquals(expected.setScale(0, RoundingMode.HALF_EVEN), test.getShippingCost());
	}
	/** {@link com.internousdev.tamaya.dto.OrderDTO#getShippingCost()} のためのテスト・メソッド。 */
	@Test
	public void testGetShippingCost3() {
	OrderDTO test = new OrderDTO();
	BigDecimal expected = new BigDecimal("-1.0E20");
	test.setShippingCost(expected);
	assertEquals(expected.setScale(0, RoundingMode.HALF_EVEN), test.getShippingCost());
	}
	/** {@link com.internousdev.tamaya.dto.OrderDTO#getShippingCost()} のためのテスト・メソッド。 */
	@Test
	public void testGetShippingCost4() {
	OrderDTO test = new OrderDTO();
	BigDecimal expected = new BigDecimal("1.0E-20");
	test.setShippingCost(expected);
	assertEquals(expected.setScale(0, RoundingMode.HALF_EVEN), test.getShippingCost());
	}
	/** {@link com.internousdev.tamaya.dto.OrderDTO#getShippingCost()} のためのテスト・メソッド。 */
	@Test
	public void testGetShippingCost5() {
	OrderDTO test = new OrderDTO();
	BigDecimal expected = new BigDecimal("-1.0E-20");
	test.setShippingCost(expected);
	assertEquals(expected.setScale(0, RoundingMode.HALF_EVEN), test.getShippingCost());
	}
	/** {@link com.internousdev.tamaya.dto.dto.OrderDTO#setShippingCost(BigDecimal)} のためのテスト・メソッド。 */
	@Test
	public void testSetShippingCost1() {
	OrderDTO test = new OrderDTO();
	BigDecimal expected = new BigDecimal("0");
	test.setShippingCost(expected);
	BigDecimal actual = test.getShippingCost();
	assertEquals(expected.setScale(0, RoundingMode.HALF_EVEN), actual);
	}
	/** {@link com.internousdev.tamaya.dto.dto.OrderDTO#setShippingCost(BigDecimal)} のためのテスト・メソッド。 */
	@Test
	public void testSetShippingCost2() {
	OrderDTO test = new OrderDTO();
	BigDecimal expected = new BigDecimal("1.0E20");
	test.setShippingCost(expected);
	BigDecimal actual = test.getShippingCost();
	assertEquals(expected.setScale(0, RoundingMode.HALF_EVEN), actual);
	}
	/** {@link com.internousdev.tamaya.dto.dto.OrderDTO#setShippingCost(BigDecimal)} のためのテスト・メソッド。 */
	@Test
	public void testSetShippingCost3() {
	OrderDTO test = new OrderDTO();
	BigDecimal expected = new BigDecimal("-1.0E20");
	test.setShippingCost(expected);
	BigDecimal actual = test.getShippingCost();
	assertEquals(expected.setScale(0, RoundingMode.HALF_EVEN), actual);
	}
	/** {@link com.internousdev.tamaya.dto.dto.OrderDTO#setShippingCost(BigDecimal)} のためのテスト・メソッド。 */
	@Test
	public void testSetShippingCost4() {
	OrderDTO test = new OrderDTO();
	BigDecimal expected = new BigDecimal("1.0E-20");
	test.setShippingCost(expected);
	BigDecimal actual = test.getShippingCost();
	assertEquals(expected.setScale(0, RoundingMode.HALF_EVEN), actual);
	}
	/** {@link com.internousdev.tamaya.dto.dto.OrderDTO#setShippingCost(BigDecimal)} のためのテスト・メソッド。 */
	@Test
	public void testSetShippingCost5() {
	OrderDTO test = new OrderDTO();
	BigDecimal expected = new BigDecimal("-1.0E-20");
	test.setShippingCost(expected);
	BigDecimal actual = test.getShippingCost();
	assertEquals(expected.setScale(0, RoundingMode.HALF_EVEN), actual);
	}
	/** {@link com.internousdev.tamaya.dto.OrderDTO#getGrandTotal()} のためのテスト・メソッド。 */
	@Test
	public void testGetGrandTotal1() {
	OrderDTO test = new OrderDTO();
	BigDecimal expected = new BigDecimal("0");
	test.setGrandTotal(expected);
	assertEquals(expected.setScale(0, RoundingMode.HALF_EVEN), test.getGrandTotal());
	}
	/** {@link com.internousdev.tamaya.dto.OrderDTO#getGrandTotal()} のためのテスト・メソッド。 */
	@Test
	public void testGetGrandTotal2() {
	OrderDTO test = new OrderDTO();
	BigDecimal expected = new BigDecimal("1.0E20");
	test.setGrandTotal(expected);
	assertEquals(expected.setScale(0, RoundingMode.HALF_EVEN), test.getGrandTotal());
	}
	/** {@link com.internousdev.tamaya.dto.OrderDTO#getGrandTotal()} のためのテスト・メソッド。 */
	@Test
	public void testGetGrandTotal3() {
	OrderDTO test = new OrderDTO();
	BigDecimal expected = new BigDecimal("-1.0E20");
	test.setGrandTotal(expected);
	assertEquals(expected.setScale(0, RoundingMode.HALF_EVEN), test.getGrandTotal());
	}
	/** {@link com.internousdev.tamaya.dto.OrderDTO#getGrandTotal()} のためのテスト・メソッド。 */
	@Test
	public void testGetGrandTotal4() {
	OrderDTO test = new OrderDTO();
	BigDecimal expected = new BigDecimal("1.0E-20");
	test.setGrandTotal(expected);
	assertEquals(expected.setScale(0, RoundingMode.HALF_EVEN), test.getGrandTotal());
	}
	/** {@link com.internousdev.tamaya.dto.OrderDTO#getGrandTotal()} のためのテスト・メソッド。 */
	@Test
	public void testGetGrandTotal5() {
	OrderDTO test = new OrderDTO();
	BigDecimal expected = new BigDecimal("-1.0E-20");
	test.setGrandTotal(expected);
	assertEquals(expected.setScale(0, RoundingMode.HALF_EVEN), test.getGrandTotal());
	}
	/** {@link com.internousdev.tamaya.dto.dto.OrderDTO#setGrandTotal(BigDecimal)} のためのテスト・メソッド。 */
	@Test
	public void testSetGrandTotal1() {
	OrderDTO test = new OrderDTO();
	BigDecimal expected = new BigDecimal("0");
	test.setGrandTotal(expected);
	BigDecimal actual = test.getGrandTotal();
	assertEquals(expected.setScale(0, RoundingMode.HALF_EVEN), actual);
	}
	/** {@link com.internousdev.tamaya.dto.dto.OrderDTO#setGrandTotal(BigDecimal)} のためのテスト・メソッド。 */
	@Test
	public void testSetGrandTotal2() {
	OrderDTO test = new OrderDTO();
	BigDecimal expected = new BigDecimal("1.0E20");
	test.setGrandTotal(expected);
	BigDecimal actual = test.getGrandTotal();
	assertEquals(expected.setScale(0, RoundingMode.HALF_EVEN), actual);
	}
	/** {@link com.internousdev.tamaya.dto.dto.OrderDTO#setGrandTotal(BigDecimal)} のためのテスト・メソッド。 */
	@Test
	public void testSetGrandTotal3() {
	OrderDTO test = new OrderDTO();
	BigDecimal expected = new BigDecimal("-1.0E20");
	test.setGrandTotal(expected);
	BigDecimal actual = test.getGrandTotal();
	assertEquals(expected.setScale(0, RoundingMode.HALF_EVEN), actual);
	}
	/** {@link com.internousdev.tamaya.dto.dto.OrderDTO#setGrandTotal(BigDecimal)} のためのテスト・メソッド。 */
	@Test
	public void testSetGrandTotal4() {
	OrderDTO test = new OrderDTO();
	BigDecimal expected = new BigDecimal("1.0E-20");
	test.setGrandTotal(expected);
	BigDecimal actual = test.getGrandTotal();
	assertEquals(expected.setScale(0, RoundingMode.HALF_EVEN), actual);
	}
	/** {@link com.internousdev.tamaya.dto.dto.OrderDTO#setGrandTotal(BigDecimal)} のためのテスト・メソッド。 */
	@Test
	public void testSetGrandTotal5() {
	OrderDTO test = new OrderDTO();
	BigDecimal expected = new BigDecimal("-1.0E-20");
	test.setGrandTotal(expected);
	BigDecimal actual = test.getGrandTotal();
	assertEquals(expected.setScale(0, RoundingMode.HALF_EVEN), actual);
	}
	/** {@link com.internousdev.tamaya.dto.OrderDTO#getOrderedAt()} のためのテスト・メソッド。 */
	@Test
	public void testGetOrderedAt1() {
	OrderDTO test = new OrderDTO();
	String expect = "";
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date expected;
	try {
	expected = sdf.parse(expect);
	test.setOrderedAt(expected);
	assertEquals(expected, test.getOrderedAt());
	} catch (ParseException e) {
	e.printStackTrace();
	}
	}
	/** {@link com.internousdev.tamaya.dto.OrderDTO#getOrderedAt()} のためのテスト・メソッド。 */
	@Test
	public void testGetOrderedAt2() {
	OrderDTO test = new OrderDTO();
	String expect = "20140103 00:00:00";
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date expected;
	try {
	expected = sdf.parse(expect);
	test.setOrderedAt(expected);
	assertEquals(expected, test.getOrderedAt());
	} catch (ParseException e) {
	e.printStackTrace();
	}
	}
	/** {@link com.internousdev.tamaya.dto.OrderDTO#getOrderedAt()} のためのテスト・メソッド。 */
	@Test
	public void testGetOrderedAt3() {
	OrderDTO test = new OrderDTO();
	String expect = "10981124 21:20:13";
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date expected;
	try {
	expected = sdf.parse(expect);
	test.setOrderedAt(expected);
	assertEquals(expected, test.getOrderedAt());
	} catch (ParseException e) {
	e.printStackTrace();
	}
	}
	/** {@link com.internousdev.tamaya.dto.OrderDTO#getOrderedAt()} のためのテスト・メソッド。 */
	@Test
	public void testGetOrderedAt4() {
	OrderDTO test = new OrderDTO();
	String expect = "207/5/19";
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date expected;
	try {
	expected = sdf.parse(expect);
	test.setOrderedAt(expected);
	assertEquals(expected, test.getOrderedAt());
	} catch (ParseException e) {
	e.printStackTrace();
	}
	}
	/** {@link com.internousdev.tamaya.dto.OrderDTO#getOrderedAt()} のためのテスト・メソッド。 */
	@Test
	public void testGetOrderedAt5() {
	OrderDTO test = new OrderDTO();
	String expect = "22/15/96";
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date expected;
	try {
	expected = sdf.parse(expect);
	test.setOrderedAt(expected);
	assertEquals(expected, test.getOrderedAt());
	} catch (ParseException e) {
	e.printStackTrace();
	}
	}
	/** {@link com.internousdev.tamaya.dto.dto.OrderDTO#setOrderedAt(Date)} のためのテスト・メソッド。 */
	@Test
	public void testSetOrderedAt1() {
	OrderDTO test = new OrderDTO();

	String expect = "";
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date expected;
	try {
	expected = sdf.parse(expect);
	test.setOrderedAt(expected);
	assertEquals(expected, test.getOrderedAt());
	} catch (ParseException e) {
	e.printStackTrace();
	}
	}
	/** {@link com.internousdev.tamaya.dto.dto.OrderDTO#setOrderedAt(Date)} のためのテスト・メソッド。 */
	@Test
	public void testSetOrderedAt2() {
	OrderDTO test = new OrderDTO();

	String expect = "20140103 00:00:00";
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date expected;
	try {
	expected = sdf.parse(expect);
	test.setOrderedAt(expected);
	assertEquals(expected, test.getOrderedAt());
	} catch (ParseException e) {
	e.printStackTrace();
	}
	}
	/** {@link com.internousdev.tamaya.dto.dto.OrderDTO#setOrderedAt(Date)} のためのテスト・メソッド。 */
	@Test
	public void testSetOrderedAt3() {
	OrderDTO test = new OrderDTO();

	String expect = "10981124 21:20:13";
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date expected;
	try {
	expected = sdf.parse(expect);
	test.setOrderedAt(expected);
	assertEquals(expected, test.getOrderedAt());
	} catch (ParseException e) {
	e.printStackTrace();
	}
	}
	/** {@link com.internousdev.tamaya.dto.dto.OrderDTO#setOrderedAt(Date)} のためのテスト・メソッド。 */
	@Test
	public void testSetOrderedAt4() {
	OrderDTO test = new OrderDTO();

	String expect = "207/5/19";
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date expected;
	try {
	expected = sdf.parse(expect);
	test.setOrderedAt(expected);
	assertEquals(expected, test.getOrderedAt());
	} catch (ParseException e) {
	e.printStackTrace();
	}
	}
	/** {@link com.internousdev.tamaya.dto.dto.OrderDTO#setOrderedAt(Date)} のためのテスト・メソッド。 */
	@Test
	public void testSetOrderedAt5() {
	OrderDTO test = new OrderDTO();

	String expect = "22/15/96";
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date expected;
	try {
	expected = sdf.parse(expect);
	test.setOrderedAt(expected);
	assertEquals(expected, test.getOrderedAt());
	} catch (ParseException e) {
	e.printStackTrace();
	}
	}


}
