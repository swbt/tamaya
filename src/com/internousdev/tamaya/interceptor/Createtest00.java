package com.internousdev.tamaya.interceptor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


/**
 * JUnit用のTestメソッドの雛形を手抜きで作るためのクラス C:\Users\internousdev\Desktop\test.txt に出力する
 *
 * @author TAKAHIRO ADACHI
 * @since 1.0
 */
public class Createtest00 {
	public static void main(String[] args) {
		ArrayList<Var> varList = new ArrayList<>();
		varList.add(new Var("int", "orderId"));
		varList.add(new Var("int", "totalQuantity"));
		varList.add(new Var("BigDecimal", "subtotal"));
		varList.add(new Var("BigDecimal", "shippingCost"));
		varList.add(new Var("BigDecimal", "grandTotal"));
		varList.add(new Var("Date", "orderedAt"));

		Target target = new Target("com.internousdev.tamaya.dto", "OrderDTO");
		target.printTest(varList);
	}
}

class Var {
	String type;
	String name;

	Var(String type, String name) {
		this.type = type;
		this.name = name;
	}
}

class Target {
	String packageName;
	String className;

	Target(String projectName, String className) {
		this.packageName = projectName;
		this.className = className;
	}

	public void printTest(ArrayList<Var> varList) {
		File file = new File("C:\\Users\\internousdev\\Desktop\\test2.txt");
		try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));) {
			for (int i = 0; i < varList.size(); i++) {
				String getter = "get" + varList.get(i).name.substring(0, 1).toUpperCase()
						+ varList.get(i).name.substring(1);
				String setter = "set" + varList.get(i).name.substring(0, 1).toUpperCase()
						+ varList.get(i).name.substring(1);
				String testGetter = "testGet" + varList.get(i).name.substring(0, 1).toUpperCase()
						+ varList.get(i).name.substring(1);
				String testSetter = "testSet" + varList.get(i).name.substring(0, 1).toUpperCase()
						+ varList.get(i).name.substring(1);
				if (varList.get(i).type.equals("int")) {
					int expected = 0;
					String outOfRange = "";
					for (int j = 1; j <= 5; j++) {
						pw.println(
								"/** {@link " + packageName + "." + className + "#" + getter + "()} のためのテスト・メソッド。 */");
						pw.println("@Test");
						pw.println("public void " + testGetter + j + "() {");
						pw.println(className + " test = new " + className + "();");
						switch (j) {
						case 1:
							expected = 0;
							break;
						case 2:
							expected = 2147483647;
							break;
						case 3:
							expected = -2147483648;
							break;
						case 4:
							outOfRange = "2147483648";
							break;
						case 5:
							outOfRange = "-2147483649";
							break;
						}
						switch (j) {
						case 1:
						case 2:
						case 3:
							pw.println("int expected = " + expected + ";");
							pw.println("test." + setter + "(expected);");
							pw.println("assertEquals(expected, test." + getter + "());");
							pw.println("}");
							break;
						case 4:
						case 5:
							pw.println("try {");
							pw.println("int outOfRange = Integer.parseInt(\"" + outOfRange + "\");");
							pw.println("test." + setter + "(outOfRange);");
							pw.println("} catch (RuntimeException e) {");
							pw.println(
									"assertEquals(e.getMessage(), \"For input string: \\\"" + outOfRange + "\\\"\");");
							pw.println("}");
							pw.println("}");
							break;
						}
					}
					for (int j = 1; j <= 5; j++) {
						pw.println("/** {@link " + packageName + ".dto." + className + "#" + setter
								+ "(int)} のためのテスト・メソッド。 */");
						pw.println("@Test");
						pw.println("public void " + testSetter + j + "() {");
						pw.println(className + " test = new " + className + "();");
						switch (j) {
						case 1:
							expected = 0;
							break;
						case 2:
							expected = 2147483647;
							break;
						case 3:
							expected = -2147483648;
							break;
						case 4:
							outOfRange = "2147483648";
							break;
						case 5:
							outOfRange = "-2147483649";
							break;
						}
						switch (j) {
						case 1:
						case 2:
						case 3:
							pw.println("int expected = " + expected + ";");
							pw.println("test." + setter + "(expected);");
							pw.println("int actual = test." + getter + "();");
							pw.println("assertEquals(expected, actual);");
							pw.println("}");
							break;
						case 4:
						case 5:
							pw.println("try {");
							pw.println("int outOfRange = Integer.parseInt(\"" + outOfRange + "\");");
							pw.println("test." + setter + "(outOfRange);");

							pw.println("} catch (RuntimeException e) {");
							pw.println(
									"assertEquals(e.getMessage(), \"For input string: \\\"" + outOfRange + "\\\"\");");
							pw.println("}");
							pw.println("}");
							break;
						}
					}
				} else if (varList.get(i).type.equals("String")) {
					String expected = "";
					for (int j = 1; j <= 8; j++) {
						pw.println(
								"/** {@link " + packageName + "." + className + "#" + getter + "()} のためのテスト・メソッド。 */");
						pw.println("@Test");
						pw.println("public void " + testGetter + j + "() {");
						pw.println(className + " test = new " + className + "();");
						switch (j) {
						case 1:
							expected = null;
							break;
						case 2:
							expected = "";
							break;
						case 3:
							expected = " ";
							break;
						case 4:
							expected = "　";
							break;
						case 5:
							expected = "abc123";
							break;
						case 6:
							expected = "あいう１２３";
							break;
						case 7:
							expected = "abc123あいう１２３";
							break;
						case 8:
							expected = "ａｂｃ１２３あいう漢字";
							break;
						}
						pw.println("String expected = \"" + expected + "\";");
						pw.println("test." + setter + "(expected);");
						pw.println("String actual = test." + getter + "();");
						pw.println("assertEquals(expected, actual);");
						pw.println("}");
					}
					for (int j = 1; j <= 8; j++) {
						pw.println("/** {@link " + packageName + "." + className + "#" + setter + "("
								+ varList.get(i).type + ")} のためのテスト・メソッド。 */");
						pw.println("@Test");
						pw.println("public void " + testSetter + j + "() {");
						pw.println(className + " test = new " + className + "();");
						switch (j) {
						case 1:
							expected = null;
							break;
						case 2:
							expected = "";
							break;
						case 3:
							expected = " ";
							break;
						case 4:
							expected = "　";
							break;
						case 5:
							expected = "abc123";
							break;
						case 6:
							expected = "あいう１２３";
							break;
						case 7:
							expected = "abc123あいう１２３";
							break;
						case 8:
							expected = "ａｂｃ１２３あいう漢字";
							break;
						}
						pw.println("String expected = \"" + expected + "\";");
						pw.println("test." + setter + "(expected);");
						pw.println("String actual = test." + getter + "();");
						pw.println("assertEquals(expected, actual);");
						pw.println("}");
					}
				} else if (varList.get(i).type.equals("BigDecimal")) {
					String expected = "";
					for (int j = 1; j <= 5; j++) {
						pw.println(
								"/** {@link " + packageName + "." + className + "#" + getter + "()} のためのテスト・メソッド。 */");
						pw.println("@Test");
						pw.println("public void " + testGetter + j + "() {");
						pw.println(className + " test = new " + className + "();");
						switch (j) {
						case 1:
							expected = "0";
							break;
						case 2:
							expected = "1.0E20";
							break;
						case 3:
							expected = "-1.0E20";
							break;
						case 4:
							expected = "1.0E-20";
							break;
						case 5:
							expected = "-1.0E-20";
							break;
						}
						pw.println("BigDecimal expected = new BigDecimal(\"" + expected + "\");");
						pw.println("test." + setter + "(expected);");
						pw.println("assertEquals(expected, test." + getter + "());");
						pw.println("}");
					}
					for (int j = 1; j <= 5; j++) {
						pw.println("/** {@link " + packageName + ".dto." + className + "#" + setter + "("
								+ varList.get(i).type + ")} のためのテスト・メソッド。 */");
						pw.println("@Test");
						pw.println("public void " + testSetter + j + "() {");
						pw.println(className + " test = new " + className + "();");
						switch (j) {
						case 1:
							expected = "0";
							break;
						case 2:
							expected = "1.0E20";
							break;
						case 3:
							expected = "-1.0E20";
							break;
						case 4:
							expected = "1.0E-20";
							break;
						case 5:
							expected = "-1.0E-20";
							break;
						}
						pw.println("BigDecimal expected = new BigDecimal(\"" + expected + "\");");
						pw.println("test." + setter + "(expected);");
						pw.println("BigDecimal actual = test." + getter + "();");
						pw.println("assertEquals(expected, actual);");
						pw.println("}");
					}
				}else if(varList.get(i).type.equals("Date")) {
					String expected = "";
					for (int j = 1; j <= 5; j++) {
						pw.println(
								"/** {@link " + packageName + "." + className + "#" + getter + "()} のためのテスト・メソッド。 */");
						pw.println("@Test");
						pw.println("public void " + testGetter + j + "() {");
						pw.println(className + " test = new " + className + "();");
						switch (j) {
						case 1:
							expected = "2004-01-01";
							break;
						case 2:
							expected = "2222-05-03";
							break;
						case 3:
							expected = "12/31/9999";
							break;
						case 4:
							expected = "9999-12-31";
							break;
						case 5:
							expected = "01/15/96";
							break;
						}
						pw.println("Date expected = \"" + expected + "\";");
						pw.println("test." + setter + "(expected);");
						pw.println("assertEquals(expected, test." + getter + "());");
						pw.println("}");
					}
					for (int j = 1; j <= 5; j++) {
						pw.println("/** {@link " + packageName + ".dto." + className + "#" + setter + "("
								+ varList.get(i).type + ")} のためのテスト・メソッド。 */");
						pw.println("@Test");
						pw.println("public void " + testSetter + j + "() {");
						pw.println(className + " test = new " + className + "();");
						switch (j) {
						case 1:
							expected = "2004-01-01";
							break;
						case 2:
							expected = "2222-05-03";
							break;
						case 3:
							expected = "12/31/9999";
							break;
						case 4:
							expected = "9999-12-31";
							break;
						case 5:
							expected = "01/15/96";
							break;
						}
						pw.println("Date expected = \"" + expected + "\";");
						pw.println("test." + setter + "(expected);");
						pw.println("Date actual = test." + getter + "();");
						pw.println("assertEquals(expected, actual);");
						pw.println("}");
					}






				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}