/**
 *
 */
package com.internousdev.tamaya.action;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dao.AddToCartDAO;
import com.internousdev.tamaya.dto.CartDTO;
import com.internousdev.tamaya.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class AddToCartAction extends ActionSupport implements SessionAware {
	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = -616455276103431676L;
	/**
	 * カートID private int cartId;
	 */

	private int userId;				//ユーザーID

	private int itemId;				// 商品ID

	private String itemName;		// 商品名

	private BigDecimal price;			//単価

	private int quantity;			//数量

	private String imgPath;			//イメージファイルパス

	private BigDecimal total;				//合計金額

	private int addCount;			//カートへ商品追加処理をした件数

	private ArrayList<CartDTO> cartList;			//カート情報

	private ArrayList<ItemDTO> itemStatus;			//商品情報

	private Map<String, Object> session;			//セッション情報

	/**
	 * 実行メソッド 処理内容と順番 1：セッション情報を持っているか判断 2：購入数が在庫数を超えていないか判断
	 * 3：遷移元のitemId,itemName,price,quantity,imgPathとsession内のuserIdを使用し、
	 * カートへ指定商品を登録 4：カートへ登録された情報を取得 5：カート内の情報を元に購入商品の合計金額金額を算出
	 * @author MISA KIKUCHI
	 * @since 2017/05/24
	 * @version 1.0
	 */

	public String execute() throws SQLException {

		String result = ERROR;

		if (session.containsKey("userId")) {
			userId = (int) session.get("userId");
			AddToCartDAO dao = new AddToCartDAO();
			itemStatus = dao.itemStatus(itemId);

				addCount = dao.addToCart(userId, itemId);
				cartList = dao.selected(userId);
				if (cartList.size() > 0) {
					for (int i = 0; i < cartList.size(); i++) {
						total = total.add(cartList.get(i).getPrice()) .multiply (BigDecimal.valueOf(cartList.get(i).getQuantity()));
					}
					result = SUCCESS;
				}
		}
		return result;
	}


	// 以下アクセサー

	/**
	 * ユーザーID取得メソッド
	 *
	 * @author MISA KIKUCHI
	 * @return userId ユーザーID
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * ユーザーID格納メソッド
	 *
	 * @author MISA KIKUCHI
	 * @param userId セットする userId
	 *
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * 商品ID取得メソッド
	 *
	 * @author MISA KIKUCHI
	 * @return itemId 商品ID
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * 商品ID格納メソッド
	 *
	 * @author MISA KIKUCHI
	 * @param itemId セットする itemId
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * 商品名取得メソッド
	 *
	 * @author MISA KIKUCHI
	 * @return itemName 商品名
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * 商品名格納メソッド
	 *
	 * @author MISA KIKUCHI
	 * @param itemName　セットする itemName
	 */
	public void setItemsName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * 単価取得メソッド
	 *
	 * @author MISA KIKUCHI
	 * @return price 価格
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * 単価格納メソッド
	 *
	 * @author MISA KIKUCHI
	 * @param price セットする price
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * 数量取得メソッド
	 *
	 * @author MISA KIKUCHI
	 * @return quantities 購入数
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * 数量格納メソッド
	 *
	 * @author MISA KIKUCHI
	 * @param quantities
	 *            購入数
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * イメージファイルパス取得メソッド
	 *
	 * @author MISA KIKUCHI
	 * @return imgPathイメージファイルパス
	 */
	public String getImgPath() {
		return imgPath;
	}

	/**
	 * イメージファイルパス格納メソッド
	 *
	 * @author MISA KIKUCHI
	 * @param imgPath　セットする imgpath
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	/**
	 * 合計金額取得メソッド
	 *
	 * @author MISA KIKUCHI
	 * @return amountAll 合計金額
	 */
	public BigDecimal getTotal() {
		return total;
	}

	/**
	 * 合計金額格納メソッド
	 *
	 * @author MISA KIKUCHI
	 * @param amountAll セットする amountAll
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
	}

    /**
	 * カートへ商品追加処理をした件数を取得するメソッド
	 * @author MISA KIKUCHI
	 * @return addCount カートへ商品追加処理をした件数
	 */
	public int getAddCount() {
		return addCount;
	}

	/**
	 * カートへ商品追加処理をした件数を格納するメソッド
	 *
	 * @author MISA KIKUCHI
	 * @param addCount セットする addCount
	 */
	public void setAddcount(int addCount) {
		this.addCount = addCount;
	}

	/**
	 * カート情報を取得するメソッド
	 *
	 * @author MISA KIKUCHI
	 * @return cartList カート情報
	 */
	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}

	/**
	 * カート情報を格納するメソッド
	 *
	 * @author MISA KIKUCHI
	 * @param cartList セットする cartList
	 */
	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList = cartList;
	}

	/**
	 * 商品情報を取得するメソッド
	 * @author MISA KIKUCHI
	 * @return itemStatus 商品情報
	 */
	public ArrayList<ItemDTO> getItemStatus() {
		return itemStatus;
	}

	/**
	 * 商品情報を格納するメソッド
	 * @author MISA KIKUCHI
	 * @param itemStatus セットする itemStatus
	 */
	public void setItemStatus(ArrayList<ItemDTO> itemStatus) {
		this.itemStatus = itemStatus;
	}

	/**
	 * セッション操作用情報を取得するメソッド
	 * @author MISA KIKUCHI
	 * @return session セッション情報
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション情報を格納するメソッド
	 *
	 * @author MISA KIKUCHI
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}




