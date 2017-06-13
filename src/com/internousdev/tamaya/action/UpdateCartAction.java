/**
 *
 */
package com.internousdev.tamaya.action;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.tamaya.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class UpdateCartAction extends ActionSupport implements SessionAware{

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID=-869165581865322731L;
	/**
	* カートID(未定義)
	*/
	private int cartId;
	/**
	* ユーザーID
	*/
	private int userId;
	/**
	*商品ID
	*/
	private int itemId;
	/**
	*商品名
	*/
	private String itemName;
	/**
	* 価格
	*/
	private BigDecimal price;
	/**
	*購入数
	*/
	private int quantity;
	/**
	*イメージファイルパス
	*/
	private String imgPath;
	/**
	*購入商品の小計価格
	*/
	private BigDecimal subtotal;
	/**
	*購入商品の合計価格
	*/
	private BigDecimal total;
	/**
	* 更新処理をした件数
	*/
	private int updateCount;
	/**
	*カート情報（未定義）
	*/
	private ArrayList<CartDTO> cartList;
	/**
	 *商品情報
	 */
	private ArrayList<ItemDTO> itemDetail;
	/**
	 *セッション情報
	 */
	private Map<String,Object> session;

	/**
	 * カートの上限処理を実行するメソッド
	 * @author ryusei tanaka
	 * @since 2017/06/12
	 * @version 1.0
	 */
//	public String execute() throws SQLException {
//
//		String result=LOGIN;
//		CartUpdateDAO cartUpdateDAO=new CartUpdateDAO();
//		GoItemDetailDAO goItemDetailDAO=new GoItemDetailDAO();
//		GoCartDAO goCartdao=new GoCartDAO();
//		PurchaseCompleteDAO pulchaseDao=new PurchaseCompleteDAO();
//
//		//セッション情報の確認
//		if(session.containsKey("userId")){
//			userId=(int) session.get("userId");
//
////			itemStatus=goItemDetailDAO.selectbyItem(itemId);//商品情報収集
//
//			//商品情報をカートに追加
////			updateCount=cartUpdateDAO.updateCart(cartId,userId,quantity);
//			//数量に0以下が指定された場合の処理
//			if(quantity<=0){
//				CartDeleteDAO DelDao=new CartDeleteDAO();
////				DelDao.delete(userId,cartId);
//			}
//
//			//アレイリストに追加
////			cartList=goCartDao.selected.Item(userId);
////			if(pulchaseDao.StockCheck(cartList)=="OK"){//在庫切れか？okなら次へ！
//				if(cartList.size()>0){
////					for(BigDecimal i=0;i<cartList.size(); i++){
////						total +=(cartList.get(i).getPrice())*(cartList.get(i).getQuantity());
//					}
//				result=SUCCESS;
//				}
////				else if(pulchaseDao.stockCheck(cartList)=="NG"){
//				}else{
//					//在庫切れだったら、どの商品が在庫切れかをチェックする
////					itemName=pulchaseDao.stockcheck(cartList);
////					result=ERROR;
//			}
////		}
//		return result;
////		}
//
//	}
	/**
	* カートIDを取得するメソッド
	* @return cartId カートID
	*/
	public int getCartId(){
		return cartId;
	}
	/**
	 * カートIDを格納するメソッド
	 * @param cartId セットする cartId
	 */
	public void setCartId(int cartId){
		this.cartId=cartId;
	}
	/**
	 * ユーザーIDを取得するメソッド
	 * @return userId ユーザーID
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * ユーザーIDを格納するメソッド
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * 商品IDを取得するメソッド
	 * @return itemId 商品ID
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * 商品IDを格納するメソッド
	 * @param itemId セットする itemId
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * 商品名を取得するメソッド
	 * @return itemName 商品名
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * 商品名を格納するメソッド
	 * @param itemName セットする itemsName
	 */
	public void setItemsName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * 価格を取得するメソッド
	 * @return price 価格
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * 価格を格納するメソッド
	 * @param price セットする price
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * 購入数を取得するメソッド
	 * @return quantities 購入数
	 */
	public int getQuantitiy() {
		return quantity;
	}

	/**
	 * 購入数を格納するメソッド
	 * @param quantity セットする quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * イメージファイルパスを取得するメソッド
	 * @return imgPath イメージファイルパス
	 */
	public String getImgPath() {
		return imgPath;
	}

	/**
	 * イメージファイルパスを格納するメソッド
	 * @param imgPath セットする imgPath
	 */
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	/**
	 * 小計金額を取得するメソッド
	 * @return amountAll 合計金額
	 */
	public BigDecimal getSubTotal() {
		return subtotal;
	}
	/**
	 * 小計金額を格納するメソッド
	 * @param total セットする total
	 */
	public void setSubTotal(BigDecimal subtotal) {
		this.total = subtotal;
	}
	/**
	 * 合計金額を取得するメソッド
	 * @return amountAll 合計金額
	 */
	public BigDecimal getTotal() {
		return total;
	}

	/**
	 * 合計金額を格納するメソッド
	 * @param total セットする total
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	/**
	 * 更新処理をした件数を取得するメソッド
	 * @return updateCount 更新処理をした件数
	 */
	public int getUpdateCount() {
		return getUpdateCount();
	}

	/**
	 * 更新処理をした件数を格納するメソッド
	 * @param updateCount セットする updateCount
	 */
	public void setUpdateCount(int updateCount) {
		this.updateCount = updateCount;
	}

	/**
	 * カート情報を取得するメソッド
	 * @return updatedAt カート情報
	 */
	public ArrayList<CartDTO> getCartList() {
		return cartList;
	}

	/**
	 * カート情報を格納するメソッド
	 * @param updatedAt セットする cartList
	 */
	public void setCartList(ArrayList<CartDTO> cartList) {
		this.cartList =cartList;
	}

	/**
	 * 商品情報を取得するメソッド
	 * @return itemDetail 商品情報
	 */
	public ArrayList<ItemDTO> getItemDetail() {
		return itemDetail;
	}

	/**
	 * 商品情報を格納するメソッド
	 * @param itemDetail セットする itemStatus
	 */
	public void setItemStatus(ArrayList<ItemDTO> itemDetail) {
		this.itemDetail = itemDetail;
	}

	/**
	 * セッション情報を取得するメソッド
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション情報を格納するメソッド
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}

