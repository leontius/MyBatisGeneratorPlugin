package jp.takuya152005.entities.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IUserBookmarkExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	public IUserBookmarkExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Long value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Long value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Long value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Long value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Long value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Long> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Long> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Long value1, Long value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Long value1, Long value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andBookmarkUserIdIsNull() {
			addCriterion("bookmark_user_id is null");
			return (Criteria) this;
		}

		public Criteria andBookmarkUserIdIsNotNull() {
			addCriterion("bookmark_user_id is not null");
			return (Criteria) this;
		}

		public Criteria andBookmarkUserIdEqualTo(Long value) {
			addCriterion("bookmark_user_id =", value, "bookmarkUserId");
			return (Criteria) this;
		}

		public Criteria andBookmarkUserIdNotEqualTo(Long value) {
			addCriterion("bookmark_user_id <>", value, "bookmarkUserId");
			return (Criteria) this;
		}

		public Criteria andBookmarkUserIdGreaterThan(Long value) {
			addCriterion("bookmark_user_id >", value, "bookmarkUserId");
			return (Criteria) this;
		}

		public Criteria andBookmarkUserIdGreaterThanOrEqualTo(Long value) {
			addCriterion("bookmark_user_id >=", value, "bookmarkUserId");
			return (Criteria) this;
		}

		public Criteria andBookmarkUserIdLessThan(Long value) {
			addCriterion("bookmark_user_id <", value, "bookmarkUserId");
			return (Criteria) this;
		}

		public Criteria andBookmarkUserIdLessThanOrEqualTo(Long value) {
			addCriterion("bookmark_user_id <=", value, "bookmarkUserId");
			return (Criteria) this;
		}

		public Criteria andBookmarkUserIdIn(List<Long> values) {
			addCriterion("bookmark_user_id in", values, "bookmarkUserId");
			return (Criteria) this;
		}

		public Criteria andBookmarkUserIdNotIn(List<Long> values) {
			addCriterion("bookmark_user_id not in", values, "bookmarkUserId");
			return (Criteria) this;
		}

		public Criteria andBookmarkUserIdBetween(Long value1, Long value2) {
			addCriterion("bookmark_user_id between", value1, value2, "bookmarkUserId");
			return (Criteria) this;
		}

		public Criteria andBookmarkUserIdNotBetween(Long value1, Long value2) {
			addCriterion("bookmark_user_id not between", value1, value2, "bookmarkUserId");
			return (Criteria) this;
		}

		public Criteria andCallPointIsNull() {
			addCriterion("call_point is null");
			return (Criteria) this;
		}

		public Criteria andCallPointIsNotNull() {
			addCriterion("call_point is not null");
			return (Criteria) this;
		}

		public Criteria andCallPointEqualTo(Integer value) {
			addCriterion("call_point =", value, "callPoint");
			return (Criteria) this;
		}

		public Criteria andCallPointNotEqualTo(Integer value) {
			addCriterion("call_point <>", value, "callPoint");
			return (Criteria) this;
		}

		public Criteria andCallPointGreaterThan(Integer value) {
			addCriterion("call_point >", value, "callPoint");
			return (Criteria) this;
		}

		public Criteria andCallPointGreaterThanOrEqualTo(Integer value) {
			addCriterion("call_point >=", value, "callPoint");
			return (Criteria) this;
		}

		public Criteria andCallPointLessThan(Integer value) {
			addCriterion("call_point <", value, "callPoint");
			return (Criteria) this;
		}

		public Criteria andCallPointLessThanOrEqualTo(Integer value) {
			addCriterion("call_point <=", value, "callPoint");
			return (Criteria) this;
		}

		public Criteria andCallPointIn(List<Integer> values) {
			addCriterion("call_point in", values, "callPoint");
			return (Criteria) this;
		}

		public Criteria andCallPointNotIn(List<Integer> values) {
			addCriterion("call_point not in", values, "callPoint");
			return (Criteria) this;
		}

		public Criteria andCallPointBetween(Integer value1, Integer value2) {
			addCriterion("call_point between", value1, value2, "callPoint");
			return (Criteria) this;
		}

		public Criteria andCallPointNotBetween(Integer value1, Integer value2) {
			addCriterion("call_point not between", value1, value2, "callPoint");
			return (Criteria) this;
		}

		public Criteria andLastCallDatetimeIsNull() {
			addCriterion("last_call_datetime is null");
			return (Criteria) this;
		}

		public Criteria andLastCallDatetimeIsNotNull() {
			addCriterion("last_call_datetime is not null");
			return (Criteria) this;
		}

		public Criteria andLastCallDatetimeEqualTo(Date value) {
			addCriterion("last_call_datetime =", value, "lastCallDatetime");
			return (Criteria) this;
		}

		public Criteria andLastCallDatetimeNotEqualTo(Date value) {
			addCriterion("last_call_datetime <>", value, "lastCallDatetime");
			return (Criteria) this;
		}

		public Criteria andLastCallDatetimeGreaterThan(Date value) {
			addCriterion("last_call_datetime >", value, "lastCallDatetime");
			return (Criteria) this;
		}

		public Criteria andLastCallDatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("last_call_datetime >=", value, "lastCallDatetime");
			return (Criteria) this;
		}

		public Criteria andLastCallDatetimeLessThan(Date value) {
			addCriterion("last_call_datetime <", value, "lastCallDatetime");
			return (Criteria) this;
		}

		public Criteria andLastCallDatetimeLessThanOrEqualTo(Date value) {
			addCriterion("last_call_datetime <=", value, "lastCallDatetime");
			return (Criteria) this;
		}

		public Criteria andLastCallDatetimeIn(List<Date> values) {
			addCriterion("last_call_datetime in", values, "lastCallDatetime");
			return (Criteria) this;
		}

		public Criteria andLastCallDatetimeNotIn(List<Date> values) {
			addCriterion("last_call_datetime not in", values, "lastCallDatetime");
			return (Criteria) this;
		}

		public Criteria andLastCallDatetimeBetween(Date value1, Date value2) {
			addCriterion("last_call_datetime between", value1, value2, "lastCallDatetime");
			return (Criteria) this;
		}

		public Criteria andLastCallDatetimeNotBetween(Date value1, Date value2) {
			addCriterion("last_call_datetime not between", value1, value2, "lastCallDatetime");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgIsNull() {
			addCriterion("delete_flg is null");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgIsNotNull() {
			addCriterion("delete_flg is not null");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgEqualTo(Byte value) {
			addCriterion("delete_flg =", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgNotEqualTo(Byte value) {
			addCriterion("delete_flg <>", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgGreaterThan(Byte value) {
			addCriterion("delete_flg >", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgGreaterThanOrEqualTo(Byte value) {
			addCriterion("delete_flg >=", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgLessThan(Byte value) {
			addCriterion("delete_flg <", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgLessThanOrEqualTo(Byte value) {
			addCriterion("delete_flg <=", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgIn(List<Byte> values) {
			addCriterion("delete_flg in", values, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgNotIn(List<Byte> values) {
			addCriterion("delete_flg not in", values, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgBetween(Byte value1, Byte value2) {
			addCriterion("delete_flg between", value1, value2, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgNotBetween(Byte value1, Byte value2) {
			addCriterion("delete_flg not between", value1, value2, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeIsNull() {
			addCriterion("update_datetime is null");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeIsNotNull() {
			addCriterion("update_datetime is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeEqualTo(Date value) {
			addCriterion("update_datetime =", value, "updateDatetime");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeNotEqualTo(Date value) {
			addCriterion("update_datetime <>", value, "updateDatetime");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeGreaterThan(Date value) {
			addCriterion("update_datetime >", value, "updateDatetime");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("update_datetime >=", value, "updateDatetime");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeLessThan(Date value) {
			addCriterion("update_datetime <", value, "updateDatetime");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeLessThanOrEqualTo(Date value) {
			addCriterion("update_datetime <=", value, "updateDatetime");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeIn(List<Date> values) {
			addCriterion("update_datetime in", values, "updateDatetime");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeNotIn(List<Date> values) {
			addCriterion("update_datetime not in", values, "updateDatetime");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeBetween(Date value1, Date value2) {
			addCriterion("update_datetime between", value1, value2, "updateDatetime");
			return (Criteria) this;
		}

		public Criteria andUpdateDatetimeNotBetween(Date value1, Date value2) {
			addCriterion("update_datetime not between", value1, value2, "updateDatetime");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeIsNull() {
			addCriterion("insert_datetime is null");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeIsNotNull() {
			addCriterion("insert_datetime is not null");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeEqualTo(Date value) {
			addCriterion("insert_datetime =", value, "insertDatetime");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeNotEqualTo(Date value) {
			addCriterion("insert_datetime <>", value, "insertDatetime");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeGreaterThan(Date value) {
			addCriterion("insert_datetime >", value, "insertDatetime");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("insert_datetime >=", value, "insertDatetime");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeLessThan(Date value) {
			addCriterion("insert_datetime <", value, "insertDatetime");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeLessThanOrEqualTo(Date value) {
			addCriterion("insert_datetime <=", value, "insertDatetime");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeIn(List<Date> values) {
			addCriterion("insert_datetime in", values, "insertDatetime");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeNotIn(List<Date> values) {
			addCriterion("insert_datetime not in", values, "insertDatetime");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeBetween(Date value1, Date value2) {
			addCriterion("insert_datetime between", value1, value2, "insertDatetime");
			return (Criteria) this;
		}

		public Criteria andInsertDatetimeNotBetween(Date value1, Date value2) {
			addCriterion("insert_datetime not between", value1, value2, "insertDatetime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table i_user_bookmark_0
	 * @mbggenerated
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table i_user_bookmark_0
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}