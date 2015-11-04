package hoang.paraline.entities;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 管理者権限エンティティ
 * 
 * @author tdhay_000
 *
 */
public class AdminAuth implements Serializable {
	
	/**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
	 * ID
	 */
	private Integer id;

	/**
	 * 管理ユーザID
	 */
	private Integer adminUserId;
	
	/**
	 * 権限レベル
	 */
	private Integer authLevel;
	
	/**
	 * 削除フラグ
	 */
	private boolean deleteFlag;
	
	/**
	 * 作成日時
	 */
	private Timestamp createdTime;
	
	/**
	 * 更新日時
	 */
	private Timestamp updatedTime;

	/**
	 * id を取得する。
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * id を設定する。
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * adminUserId を取得する。
	 * @return adminUserId
	 */
	public Integer getAdminUserId() {
		return adminUserId;
	}

	/**
	 * adminUserId を設定する。
	 * @param adminUserId
	 */
	public void setAdminUserId(Integer adminUserId) {
		this.adminUserId = adminUserId;
	}

	/**
	 * authLevel を取得する。
	 * @return authLevel
	 */
	public Integer getAuthLevel() {
		return authLevel;
	}

	/**
	 * authLevel を設定する。
	 * @param authLevel
	 */
	public void setAuthLevel(Integer authLevel) {
		this.authLevel = authLevel;
	}

	/**
	 * deleteFlag を取得する。
	 * @return deleteFlag
	 */
	public boolean isDeleteFlag() {
		return deleteFlag;
	}

	/**
	 * deleteFlag を設定する。
	 * @param deleteFlag
	 */
	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	/**
	 * createdTime を取得する。
	 * @return createdTime
	 */
	public Timestamp getCreatedTime() {
		return createdTime;
	}

	/**
	 * createdTime を設定する。
	 * @param createdTime
	 */
	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * updatedTime を取得する。
	 * @return updatedTime
	 */
	public Timestamp getUpdatedTime() {
		return updatedTime;
	}

	/**
	 * updatedTime を設定する。
	 * @param updatedTime
	 */
	public void setUpdatedTime(Timestamp updatedTime) {
		this.updatedTime = updatedTime;
	}
	
	
	
}
