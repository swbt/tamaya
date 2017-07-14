<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--国際化用 --%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<%--国際化用 --%>
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="com.internousdev.tamaya.property.kanri_kakunin"
	var="lang" />
<title><s:text name="lang.kanri_kakunin.title" /></title>

<%--検索エンジンによるインデックスを拒否 --%>
<meta name="ROBOTS" content="NOINDEX.NOFOLLOW">
<meta name="viewport" content="width=device initial-scale=1.0">
<link rel="stylesheet" href="css/AdminLogin.css">
<link rel="stylesheet" href="css/bootstrapTWBScolor.css">
<script src="js/to-top.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-1.11.2.min.js"></script>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet"
	　integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	　crossorigin="anonymous">
</head>

<body>

	<!-- ヘッダー部分の挿入 -->
	<header>
		<s:include value="kanri_header.jsp" />
	</header>

	<div class="panel panel-default">
		<div class="panel-body">
			<h2>
				<s:text name="lang.kanri_kakunin.title" />
			</h2>
		</div>
		<div class="text-center">
			<s:form action="AdminContactAction">

				<input type="text" name="searchName"
					placeholder="<s:text name="lang.kanri_kakunin.enterName" />"
					size="20" />

				<select name="searchTitle">
					<option value=""><s:text name="lang.kanri_kakunin.all" /></option>

					<option value="<s:text name="lang.kanri_kakunin.unspecified" />"><s:text
							name="lang.kanri_kakunin.unspecified" /></option>

					<option value="<s:text name="lang.kanri_kakunin.item" />"><s:text
							name="lang.kanri_kakunin.item" /></option>

					<option value="<s:text name="lang.kanri_kakunin.payment" />"><s:text
							name="lang.kanri_kakunin.payment" /></option>

					<option value="<s:text name="lang.kanri_kakunin.change" />"><s:text
							name="lang.kanri_kakunin.change" /></option>

					<option value="<s:text name="lang.kanri_kakunin.other" />"><s:text
							name="lang.kanri_kakunin.other" /></option>
				</select>

				<select name="searchSort">
					<option value="-1"><s:text
							name="lang.kanri_kakunin.sortNew" /></option>
					<option value="1"><s:text
							name="lang.kanri_kakunin.sortOld" /></option>
				</select>

				<input type="submit"
					value="<s:text name="lang.kanri_kakunin.search" />" />

			</s:form>
		</div>
		<!-- 	検索バーここまで -->



		<s:if test="displayList != null && !displayList.isEmpty()">
			<div class="text-center">
				<br>
				<p>
					<s:property value="searchName" />
					/
					<s:property value="searchTitle" />
					/ <b><s:property value="selectList.size()" /></b>
					<s:text name="lang.admin_contact.Hits" />
					<br>
					<b><s:property value="currentPage+1" /></b> / <b><s:property
							value="pageCount" /></b>
					<s:text name="lang.kanri_kakunin.page" />
				</p>
			</div>
			<br>

			<div class="text-center">
				<s:iterator value="displayList">
					<table class="admin-contact-table" border="1"
						style="table-layout: fixed; width: 60%;">

						<tr bgcolor="#cccccc">
							<th><s:text name="lang.kanri_kakunin.userName" /></th>
							<th><s:text name="lang.kanri_kakunin.email" /></th>
						</tr>
						<tr align="center" bgcolor="#ffffff">
							<td><s:property value="userName" /></td>
							<td><s:property value="email" /></td>
						</tr>

						<tr bgcolor="#cccccc">
							<th><s:text name="lang.kanri_kakunin.title" /></th>
							<th><s:text name="lang.kanri_kakunin.dt" /></th>
						</tr>
						<tr align="center" bgcolor="#ffffff">
							<td><s:property value="title" /></td>
							<td><s:property value="dt" /></td>
						</tr>

						<tr bgcolor="#cccccc">
							<th colspan="2"><s:text name="lang.kanri_kakunin.comment" /></th>
						</tr>
						<tr align="left" bgcolor="#ffffff">
							<td colspan="2"><div class="sc">
									<s:property value="comment" escape="false" />
								</div></td>
						</tr>

					</table>
				</s:iterator>
			</div>


			<!-- ページネーション -->
			<nav class="text-center contents">
				<div class="text-center">
					<ul class="pagination">
						<!-- ページネーション（1ページ目なら） -->
						<s:if test="currentPage==0">
							<li class="disabled"><span>&laquo;</span></li>
						</s:if>

						<!-- 1ページ目以外なら -->
						<s:else>
							<li><a
								href='<s:url action="AdminContactAction">
												<s:param name="currentPage" value="currentPage -1"/>
												<s:param name="searchTitle" value="searchTitle"/>
												<s:param name="searchName" value="searchName"/>
												<s:param name="searchSort" value="searchSort"/>
												</s:url>'>&laquo;
							</a></li>
						</s:else>

						<s:iterator value="arrayPageCount" status="rs">
							<s:if
								test="%{#rs.index >= currentPage -leftPage && #rs.index <= currentPage +rightPage}">
								<s:if test="Page == #rs.index">
									<li class="disabled"><span><s:property
												value="#rs.count" /> </span></li>
								</s:if>
								<s:else>
									<li><a
										href='<s:url action="AdminContactAction">
												<s:param name="currentPage" value="#rs.index"/>
												<s:param name="searchTitle" value="searchTitle"/>
												<s:param name="searchName" value="searchName"/>
												<s:param name="searchSort" value="searchSort"/>
												</s:url>'><s:property
												value="#rs.count" /> </a></li>
								</s:else>
							</s:if>
						</s:iterator>

						<!-- ページネーション（最終ページなら） -->
						<s:if test="currentPage == pageCount-1">
							<li class="disabled"><span>&raquo;</span></li>
						</s:if>

						<s:elseif test="pageCount == 0">
							<li class="disabled"><span>&raquo;</span></li>
						</s:elseif>

						<!-- 最終ページ以外なら -->
						<s:else>
							<li><a href='<s:url action="AdminContactAction">
							<s:param name="currentPage" value="currentPage+1"/>
							<s:param name="searchTitle" value="searchTitle"/>
							<s:param name="searchName" value="searchName"/>
							<s:param name="searchSort" value="searchSort"/>
							</s:url>'>&raquo;</a>
							</li>
						</s:else>
					</ul>

				</div>
			</nav>
		</s:if>
		<s:else>
			<h1>
				<s:text name="lang.kanri_kakunin.display" />
			</h1>
		</s:else>

		<div id="page-top" class="page-top">
			<p>
				<a id="move-page-top" class="move-page-top">▲</a>
			</p>
		</div>
		<div class="panel-footer">
			<s:text name="lang.kanri_kakunin.footer" />
		</div>
	</div>
</body>
</html>