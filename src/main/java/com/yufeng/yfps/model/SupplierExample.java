package com.yufeng.yfps.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplierExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andSupIdIsNull() {
            addCriterion("sup_id is null");
            return (Criteria) this;
        }

        public Criteria andSupIdIsNotNull() {
            addCriterion("sup_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupIdEqualTo(String value) {
            addCriterion("sup_id =", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdNotEqualTo(String value) {
            addCriterion("sup_id <>", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdGreaterThan(String value) {
            addCriterion("sup_id >", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdGreaterThanOrEqualTo(String value) {
            addCriterion("sup_id >=", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdLessThan(String value) {
            addCriterion("sup_id <", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdLessThanOrEqualTo(String value) {
            addCriterion("sup_id <=", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdLike(String value) {
            addCriterion("sup_id like", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdNotLike(String value) {
            addCriterion("sup_id not like", value, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdIn(List<String> values) {
            addCriterion("sup_id in", values, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdNotIn(List<String> values) {
            addCriterion("sup_id not in", values, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdBetween(String value1, String value2) {
            addCriterion("sup_id between", value1, value2, "supId");
            return (Criteria) this;
        }

        public Criteria andSupIdNotBetween(String value1, String value2) {
            addCriterion("sup_id not between", value1, value2, "supId");
            return (Criteria) this;
        }

        public Criteria andSupNameIsNull() {
            addCriterion("sup_name is null");
            return (Criteria) this;
        }

        public Criteria andSupNameIsNotNull() {
            addCriterion("sup_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupNameEqualTo(String value) {
            addCriterion("sup_name =", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameNotEqualTo(String value) {
            addCriterion("sup_name <>", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameGreaterThan(String value) {
            addCriterion("sup_name >", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameGreaterThanOrEqualTo(String value) {
            addCriterion("sup_name >=", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameLessThan(String value) {
            addCriterion("sup_name <", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameLessThanOrEqualTo(String value) {
            addCriterion("sup_name <=", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameLike(String value) {
            addCriterion("sup_name like", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameNotLike(String value) {
            addCriterion("sup_name not like", value, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameIn(List<String> values) {
            addCriterion("sup_name in", values, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameNotIn(List<String> values) {
            addCriterion("sup_name not in", values, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameBetween(String value1, String value2) {
            addCriterion("sup_name between", value1, value2, "supName");
            return (Criteria) this;
        }

        public Criteria andSupNameNotBetween(String value1, String value2) {
            addCriterion("sup_name not between", value1, value2, "supName");
            return (Criteria) this;
        }

        public Criteria andSupOffAddrIsNull() {
            addCriterion("sup_off_addr is null");
            return (Criteria) this;
        }

        public Criteria andSupOffAddrIsNotNull() {
            addCriterion("sup_off_addr is not null");
            return (Criteria) this;
        }

        public Criteria andSupOffAddrEqualTo(String value) {
            addCriterion("sup_off_addr =", value, "supOffAddr");
            return (Criteria) this;
        }

        public Criteria andSupOffAddrNotEqualTo(String value) {
            addCriterion("sup_off_addr <>", value, "supOffAddr");
            return (Criteria) this;
        }

        public Criteria andSupOffAddrGreaterThan(String value) {
            addCriterion("sup_off_addr >", value, "supOffAddr");
            return (Criteria) this;
        }

        public Criteria andSupOffAddrGreaterThanOrEqualTo(String value) {
            addCriterion("sup_off_addr >=", value, "supOffAddr");
            return (Criteria) this;
        }

        public Criteria andSupOffAddrLessThan(String value) {
            addCriterion("sup_off_addr <", value, "supOffAddr");
            return (Criteria) this;
        }

        public Criteria andSupOffAddrLessThanOrEqualTo(String value) {
            addCriterion("sup_off_addr <=", value, "supOffAddr");
            return (Criteria) this;
        }

        public Criteria andSupOffAddrLike(String value) {
            addCriterion("sup_off_addr like", value, "supOffAddr");
            return (Criteria) this;
        }

        public Criteria andSupOffAddrNotLike(String value) {
            addCriterion("sup_off_addr not like", value, "supOffAddr");
            return (Criteria) this;
        }

        public Criteria andSupOffAddrIn(List<String> values) {
            addCriterion("sup_off_addr in", values, "supOffAddr");
            return (Criteria) this;
        }

        public Criteria andSupOffAddrNotIn(List<String> values) {
            addCriterion("sup_off_addr not in", values, "supOffAddr");
            return (Criteria) this;
        }

        public Criteria andSupOffAddrBetween(String value1, String value2) {
            addCriterion("sup_off_addr between", value1, value2, "supOffAddr");
            return (Criteria) this;
        }

        public Criteria andSupOffAddrNotBetween(String value1, String value2) {
            addCriterion("sup_off_addr not between", value1, value2, "supOffAddr");
            return (Criteria) this;
        }

        public Criteria andSupOffTelIddIsNull() {
            addCriterion("sup_off_tel_idd is null");
            return (Criteria) this;
        }

        public Criteria andSupOffTelIddIsNotNull() {
            addCriterion("sup_off_tel_idd is not null");
            return (Criteria) this;
        }

        public Criteria andSupOffTelIddEqualTo(String value) {
            addCriterion("sup_off_tel_idd =", value, "supOffTelIdd");
            return (Criteria) this;
        }

        public Criteria andSupOffTelIddNotEqualTo(String value) {
            addCriterion("sup_off_tel_idd <>", value, "supOffTelIdd");
            return (Criteria) this;
        }

        public Criteria andSupOffTelIddGreaterThan(String value) {
            addCriterion("sup_off_tel_idd >", value, "supOffTelIdd");
            return (Criteria) this;
        }

        public Criteria andSupOffTelIddGreaterThanOrEqualTo(String value) {
            addCriterion("sup_off_tel_idd >=", value, "supOffTelIdd");
            return (Criteria) this;
        }

        public Criteria andSupOffTelIddLessThan(String value) {
            addCriterion("sup_off_tel_idd <", value, "supOffTelIdd");
            return (Criteria) this;
        }

        public Criteria andSupOffTelIddLessThanOrEqualTo(String value) {
            addCriterion("sup_off_tel_idd <=", value, "supOffTelIdd");
            return (Criteria) this;
        }

        public Criteria andSupOffTelIddLike(String value) {
            addCriterion("sup_off_tel_idd like", value, "supOffTelIdd");
            return (Criteria) this;
        }

        public Criteria andSupOffTelIddNotLike(String value) {
            addCriterion("sup_off_tel_idd not like", value, "supOffTelIdd");
            return (Criteria) this;
        }

        public Criteria andSupOffTelIddIn(List<String> values) {
            addCriterion("sup_off_tel_idd in", values, "supOffTelIdd");
            return (Criteria) this;
        }

        public Criteria andSupOffTelIddNotIn(List<String> values) {
            addCriterion("sup_off_tel_idd not in", values, "supOffTelIdd");
            return (Criteria) this;
        }

        public Criteria andSupOffTelIddBetween(String value1, String value2) {
            addCriterion("sup_off_tel_idd between", value1, value2, "supOffTelIdd");
            return (Criteria) this;
        }

        public Criteria andSupOffTelIddNotBetween(String value1, String value2) {
            addCriterion("sup_off_tel_idd not between", value1, value2, "supOffTelIdd");
            return (Criteria) this;
        }

        public Criteria andSupOffTel01IsNull() {
            addCriterion("sup_off_tel01 is null");
            return (Criteria) this;
        }

        public Criteria andSupOffTel01IsNotNull() {
            addCriterion("sup_off_tel01 is not null");
            return (Criteria) this;
        }

        public Criteria andSupOffTel01EqualTo(String value) {
            addCriterion("sup_off_tel01 =", value, "supOffTel01");
            return (Criteria) this;
        }

        public Criteria andSupOffTel01NotEqualTo(String value) {
            addCriterion("sup_off_tel01 <>", value, "supOffTel01");
            return (Criteria) this;
        }

        public Criteria andSupOffTel01GreaterThan(String value) {
            addCriterion("sup_off_tel01 >", value, "supOffTel01");
            return (Criteria) this;
        }

        public Criteria andSupOffTel01GreaterThanOrEqualTo(String value) {
            addCriterion("sup_off_tel01 >=", value, "supOffTel01");
            return (Criteria) this;
        }

        public Criteria andSupOffTel01LessThan(String value) {
            addCriterion("sup_off_tel01 <", value, "supOffTel01");
            return (Criteria) this;
        }

        public Criteria andSupOffTel01LessThanOrEqualTo(String value) {
            addCriterion("sup_off_tel01 <=", value, "supOffTel01");
            return (Criteria) this;
        }

        public Criteria andSupOffTel01Like(String value) {
            addCriterion("sup_off_tel01 like", value, "supOffTel01");
            return (Criteria) this;
        }

        public Criteria andSupOffTel01NotLike(String value) {
            addCriterion("sup_off_tel01 not like", value, "supOffTel01");
            return (Criteria) this;
        }

        public Criteria andSupOffTel01In(List<String> values) {
            addCriterion("sup_off_tel01 in", values, "supOffTel01");
            return (Criteria) this;
        }

        public Criteria andSupOffTel01NotIn(List<String> values) {
            addCriterion("sup_off_tel01 not in", values, "supOffTel01");
            return (Criteria) this;
        }

        public Criteria andSupOffTel01Between(String value1, String value2) {
            addCriterion("sup_off_tel01 between", value1, value2, "supOffTel01");
            return (Criteria) this;
        }

        public Criteria andSupOffTel01NotBetween(String value1, String value2) {
            addCriterion("sup_off_tel01 not between", value1, value2, "supOffTel01");
            return (Criteria) this;
        }

        public Criteria andSupOffTel02IsNull() {
            addCriterion("sup_off_tel02 is null");
            return (Criteria) this;
        }

        public Criteria andSupOffTel02IsNotNull() {
            addCriterion("sup_off_tel02 is not null");
            return (Criteria) this;
        }

        public Criteria andSupOffTel02EqualTo(String value) {
            addCriterion("sup_off_tel02 =", value, "supOffTel02");
            return (Criteria) this;
        }

        public Criteria andSupOffTel02NotEqualTo(String value) {
            addCriterion("sup_off_tel02 <>", value, "supOffTel02");
            return (Criteria) this;
        }

        public Criteria andSupOffTel02GreaterThan(String value) {
            addCriterion("sup_off_tel02 >", value, "supOffTel02");
            return (Criteria) this;
        }

        public Criteria andSupOffTel02GreaterThanOrEqualTo(String value) {
            addCriterion("sup_off_tel02 >=", value, "supOffTel02");
            return (Criteria) this;
        }

        public Criteria andSupOffTel02LessThan(String value) {
            addCriterion("sup_off_tel02 <", value, "supOffTel02");
            return (Criteria) this;
        }

        public Criteria andSupOffTel02LessThanOrEqualTo(String value) {
            addCriterion("sup_off_tel02 <=", value, "supOffTel02");
            return (Criteria) this;
        }

        public Criteria andSupOffTel02Like(String value) {
            addCriterion("sup_off_tel02 like", value, "supOffTel02");
            return (Criteria) this;
        }

        public Criteria andSupOffTel02NotLike(String value) {
            addCriterion("sup_off_tel02 not like", value, "supOffTel02");
            return (Criteria) this;
        }

        public Criteria andSupOffTel02In(List<String> values) {
            addCriterion("sup_off_tel02 in", values, "supOffTel02");
            return (Criteria) this;
        }

        public Criteria andSupOffTel02NotIn(List<String> values) {
            addCriterion("sup_off_tel02 not in", values, "supOffTel02");
            return (Criteria) this;
        }

        public Criteria andSupOffTel02Between(String value1, String value2) {
            addCriterion("sup_off_tel02 between", value1, value2, "supOffTel02");
            return (Criteria) this;
        }

        public Criteria andSupOffTel02NotBetween(String value1, String value2) {
            addCriterion("sup_off_tel02 not between", value1, value2, "supOffTel02");
            return (Criteria) this;
        }

        public Criteria andSupOffFaxIsNull() {
            addCriterion("sup_off_fax is null");
            return (Criteria) this;
        }

        public Criteria andSupOffFaxIsNotNull() {
            addCriterion("sup_off_fax is not null");
            return (Criteria) this;
        }

        public Criteria andSupOffFaxEqualTo(String value) {
            addCriterion("sup_off_fax =", value, "supOffFax");
            return (Criteria) this;
        }

        public Criteria andSupOffFaxNotEqualTo(String value) {
            addCriterion("sup_off_fax <>", value, "supOffFax");
            return (Criteria) this;
        }

        public Criteria andSupOffFaxGreaterThan(String value) {
            addCriterion("sup_off_fax >", value, "supOffFax");
            return (Criteria) this;
        }

        public Criteria andSupOffFaxGreaterThanOrEqualTo(String value) {
            addCriterion("sup_off_fax >=", value, "supOffFax");
            return (Criteria) this;
        }

        public Criteria andSupOffFaxLessThan(String value) {
            addCriterion("sup_off_fax <", value, "supOffFax");
            return (Criteria) this;
        }

        public Criteria andSupOffFaxLessThanOrEqualTo(String value) {
            addCriterion("sup_off_fax <=", value, "supOffFax");
            return (Criteria) this;
        }

        public Criteria andSupOffFaxLike(String value) {
            addCriterion("sup_off_fax like", value, "supOffFax");
            return (Criteria) this;
        }

        public Criteria andSupOffFaxNotLike(String value) {
            addCriterion("sup_off_fax not like", value, "supOffFax");
            return (Criteria) this;
        }

        public Criteria andSupOffFaxIn(List<String> values) {
            addCriterion("sup_off_fax in", values, "supOffFax");
            return (Criteria) this;
        }

        public Criteria andSupOffFaxNotIn(List<String> values) {
            addCriterion("sup_off_fax not in", values, "supOffFax");
            return (Criteria) this;
        }

        public Criteria andSupOffFaxBetween(String value1, String value2) {
            addCriterion("sup_off_fax between", value1, value2, "supOffFax");
            return (Criteria) this;
        }

        public Criteria andSupOffFaxNotBetween(String value1, String value2) {
            addCriterion("sup_off_fax not between", value1, value2, "supOffFax");
            return (Criteria) this;
        }

        public Criteria andSupRemkIsNull() {
            addCriterion("sup_remk is null");
            return (Criteria) this;
        }

        public Criteria andSupRemkIsNotNull() {
            addCriterion("sup_remk is not null");
            return (Criteria) this;
        }

        public Criteria andSupRemkEqualTo(String value) {
            addCriterion("sup_remk =", value, "supRemk");
            return (Criteria) this;
        }

        public Criteria andSupRemkNotEqualTo(String value) {
            addCriterion("sup_remk <>", value, "supRemk");
            return (Criteria) this;
        }

        public Criteria andSupRemkGreaterThan(String value) {
            addCriterion("sup_remk >", value, "supRemk");
            return (Criteria) this;
        }

        public Criteria andSupRemkGreaterThanOrEqualTo(String value) {
            addCriterion("sup_remk >=", value, "supRemk");
            return (Criteria) this;
        }

        public Criteria andSupRemkLessThan(String value) {
            addCriterion("sup_remk <", value, "supRemk");
            return (Criteria) this;
        }

        public Criteria andSupRemkLessThanOrEqualTo(String value) {
            addCriterion("sup_remk <=", value, "supRemk");
            return (Criteria) this;
        }

        public Criteria andSupRemkLike(String value) {
            addCriterion("sup_remk like", value, "supRemk");
            return (Criteria) this;
        }

        public Criteria andSupRemkNotLike(String value) {
            addCriterion("sup_remk not like", value, "supRemk");
            return (Criteria) this;
        }

        public Criteria andSupRemkIn(List<String> values) {
            addCriterion("sup_remk in", values, "supRemk");
            return (Criteria) this;
        }

        public Criteria andSupRemkNotIn(List<String> values) {
            addCriterion("sup_remk not in", values, "supRemk");
            return (Criteria) this;
        }

        public Criteria andSupRemkBetween(String value1, String value2) {
            addCriterion("sup_remk between", value1, value2, "supRemk");
            return (Criteria) this;
        }

        public Criteria andSupRemkNotBetween(String value1, String value2) {
            addCriterion("sup_remk not between", value1, value2, "supRemk");
            return (Criteria) this;
        }

        public Criteria andSupCdateIsNull() {
            addCriterion("sup_cdate is null");
            return (Criteria) this;
        }

        public Criteria andSupCdateIsNotNull() {
            addCriterion("sup_cdate is not null");
            return (Criteria) this;
        }

        public Criteria andSupCdateEqualTo(Date value) {
            addCriterion("sup_cdate =", value, "supCdate");
            return (Criteria) this;
        }

        public Criteria andSupCdateNotEqualTo(Date value) {
            addCriterion("sup_cdate <>", value, "supCdate");
            return (Criteria) this;
        }

        public Criteria andSupCdateGreaterThan(Date value) {
            addCriterion("sup_cdate >", value, "supCdate");
            return (Criteria) this;
        }

        public Criteria andSupCdateGreaterThanOrEqualTo(Date value) {
            addCriterion("sup_cdate >=", value, "supCdate");
            return (Criteria) this;
        }

        public Criteria andSupCdateLessThan(Date value) {
            addCriterion("sup_cdate <", value, "supCdate");
            return (Criteria) this;
        }

        public Criteria andSupCdateLessThanOrEqualTo(Date value) {
            addCriterion("sup_cdate <=", value, "supCdate");
            return (Criteria) this;
        }

        public Criteria andSupCdateIn(List<Date> values) {
            addCriterion("sup_cdate in", values, "supCdate");
            return (Criteria) this;
        }

        public Criteria andSupCdateNotIn(List<Date> values) {
            addCriterion("sup_cdate not in", values, "supCdate");
            return (Criteria) this;
        }

        public Criteria andSupCdateBetween(Date value1, Date value2) {
            addCriterion("sup_cdate between", value1, value2, "supCdate");
            return (Criteria) this;
        }

        public Criteria andSupCdateNotBetween(Date value1, Date value2) {
            addCriterion("sup_cdate not between", value1, value2, "supCdate");
            return (Criteria) this;
        }

        public Criteria andSupCuserIsNull() {
            addCriterion("sup_cuser is null");
            return (Criteria) this;
        }

        public Criteria andSupCuserIsNotNull() {
            addCriterion("sup_cuser is not null");
            return (Criteria) this;
        }

        public Criteria andSupCuserEqualTo(String value) {
            addCriterion("sup_cuser =", value, "supCuser");
            return (Criteria) this;
        }

        public Criteria andSupCuserNotEqualTo(String value) {
            addCriterion("sup_cuser <>", value, "supCuser");
            return (Criteria) this;
        }

        public Criteria andSupCuserGreaterThan(String value) {
            addCriterion("sup_cuser >", value, "supCuser");
            return (Criteria) this;
        }

        public Criteria andSupCuserGreaterThanOrEqualTo(String value) {
            addCriterion("sup_cuser >=", value, "supCuser");
            return (Criteria) this;
        }

        public Criteria andSupCuserLessThan(String value) {
            addCriterion("sup_cuser <", value, "supCuser");
            return (Criteria) this;
        }

        public Criteria andSupCuserLessThanOrEqualTo(String value) {
            addCriterion("sup_cuser <=", value, "supCuser");
            return (Criteria) this;
        }

        public Criteria andSupCuserLike(String value) {
            addCriterion("sup_cuser like", value, "supCuser");
            return (Criteria) this;
        }

        public Criteria andSupCuserNotLike(String value) {
            addCriterion("sup_cuser not like", value, "supCuser");
            return (Criteria) this;
        }

        public Criteria andSupCuserIn(List<String> values) {
            addCriterion("sup_cuser in", values, "supCuser");
            return (Criteria) this;
        }

        public Criteria andSupCuserNotIn(List<String> values) {
            addCriterion("sup_cuser not in", values, "supCuser");
            return (Criteria) this;
        }

        public Criteria andSupCuserBetween(String value1, String value2) {
            addCriterion("sup_cuser between", value1, value2, "supCuser");
            return (Criteria) this;
        }

        public Criteria andSupCuserNotBetween(String value1, String value2) {
            addCriterion("sup_cuser not between", value1, value2, "supCuser");
            return (Criteria) this;
        }

        public Criteria andSupAdateIsNull() {
            addCriterion("sup_adate is null");
            return (Criteria) this;
        }

        public Criteria andSupAdateIsNotNull() {
            addCriterion("sup_adate is not null");
            return (Criteria) this;
        }

        public Criteria andSupAdateEqualTo(Date value) {
            addCriterion("sup_adate =", value, "supAdate");
            return (Criteria) this;
        }

        public Criteria andSupAdateNotEqualTo(Date value) {
            addCriterion("sup_adate <>", value, "supAdate");
            return (Criteria) this;
        }

        public Criteria andSupAdateGreaterThan(Date value) {
            addCriterion("sup_adate >", value, "supAdate");
            return (Criteria) this;
        }

        public Criteria andSupAdateGreaterThanOrEqualTo(Date value) {
            addCriterion("sup_adate >=", value, "supAdate");
            return (Criteria) this;
        }

        public Criteria andSupAdateLessThan(Date value) {
            addCriterion("sup_adate <", value, "supAdate");
            return (Criteria) this;
        }

        public Criteria andSupAdateLessThanOrEqualTo(Date value) {
            addCriterion("sup_adate <=", value, "supAdate");
            return (Criteria) this;
        }

        public Criteria andSupAdateIn(List<Date> values) {
            addCriterion("sup_adate in", values, "supAdate");
            return (Criteria) this;
        }

        public Criteria andSupAdateNotIn(List<Date> values) {
            addCriterion("sup_adate not in", values, "supAdate");
            return (Criteria) this;
        }

        public Criteria andSupAdateBetween(Date value1, Date value2) {
            addCriterion("sup_adate between", value1, value2, "supAdate");
            return (Criteria) this;
        }

        public Criteria andSupAdateNotBetween(Date value1, Date value2) {
            addCriterion("sup_adate not between", value1, value2, "supAdate");
            return (Criteria) this;
        }

        public Criteria andSupAuserIsNull() {
            addCriterion("sup_auser is null");
            return (Criteria) this;
        }

        public Criteria andSupAuserIsNotNull() {
            addCriterion("sup_auser is not null");
            return (Criteria) this;
        }

        public Criteria andSupAuserEqualTo(String value) {
            addCriterion("sup_auser =", value, "supAuser");
            return (Criteria) this;
        }

        public Criteria andSupAuserNotEqualTo(String value) {
            addCriterion("sup_auser <>", value, "supAuser");
            return (Criteria) this;
        }

        public Criteria andSupAuserGreaterThan(String value) {
            addCriterion("sup_auser >", value, "supAuser");
            return (Criteria) this;
        }

        public Criteria andSupAuserGreaterThanOrEqualTo(String value) {
            addCriterion("sup_auser >=", value, "supAuser");
            return (Criteria) this;
        }

        public Criteria andSupAuserLessThan(String value) {
            addCriterion("sup_auser <", value, "supAuser");
            return (Criteria) this;
        }

        public Criteria andSupAuserLessThanOrEqualTo(String value) {
            addCriterion("sup_auser <=", value, "supAuser");
            return (Criteria) this;
        }

        public Criteria andSupAuserLike(String value) {
            addCriterion("sup_auser like", value, "supAuser");
            return (Criteria) this;
        }

        public Criteria andSupAuserNotLike(String value) {
            addCriterion("sup_auser not like", value, "supAuser");
            return (Criteria) this;
        }

        public Criteria andSupAuserIn(List<String> values) {
            addCriterion("sup_auser in", values, "supAuser");
            return (Criteria) this;
        }

        public Criteria andSupAuserNotIn(List<String> values) {
            addCriterion("sup_auser not in", values, "supAuser");
            return (Criteria) this;
        }

        public Criteria andSupAuserBetween(String value1, String value2) {
            addCriterion("sup_auser between", value1, value2, "supAuser");
            return (Criteria) this;
        }

        public Criteria andSupAuserNotBetween(String value1, String value2) {
            addCriterion("sup_auser not between", value1, value2, "supAuser");
            return (Criteria) this;
        }

        public Criteria andSupTypeIsNull() {
            addCriterion("sup_type is null");
            return (Criteria) this;
        }

        public Criteria andSupTypeIsNotNull() {
            addCriterion("sup_type is not null");
            return (Criteria) this;
        }

        public Criteria andSupTypeEqualTo(String value) {
            addCriterion("sup_type =", value, "supType");
            return (Criteria) this;
        }

        public Criteria andSupTypeNotEqualTo(String value) {
            addCriterion("sup_type <>", value, "supType");
            return (Criteria) this;
        }

        public Criteria andSupTypeGreaterThan(String value) {
            addCriterion("sup_type >", value, "supType");
            return (Criteria) this;
        }

        public Criteria andSupTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sup_type >=", value, "supType");
            return (Criteria) this;
        }

        public Criteria andSupTypeLessThan(String value) {
            addCriterion("sup_type <", value, "supType");
            return (Criteria) this;
        }

        public Criteria andSupTypeLessThanOrEqualTo(String value) {
            addCriterion("sup_type <=", value, "supType");
            return (Criteria) this;
        }

        public Criteria andSupTypeLike(String value) {
            addCriterion("sup_type like", value, "supType");
            return (Criteria) this;
        }

        public Criteria andSupTypeNotLike(String value) {
            addCriterion("sup_type not like", value, "supType");
            return (Criteria) this;
        }

        public Criteria andSupTypeIn(List<String> values) {
            addCriterion("sup_type in", values, "supType");
            return (Criteria) this;
        }

        public Criteria andSupTypeNotIn(List<String> values) {
            addCriterion("sup_type not in", values, "supType");
            return (Criteria) this;
        }

        public Criteria andSupTypeBetween(String value1, String value2) {
            addCriterion("sup_type between", value1, value2, "supType");
            return (Criteria) this;
        }

        public Criteria andSupTypeNotBetween(String value1, String value2) {
            addCriterion("sup_type not between", value1, value2, "supType");
            return (Criteria) this;
        }

        public Criteria andSupComptypeIsNull() {
            addCriterion("sup_comptype is null");
            return (Criteria) this;
        }

        public Criteria andSupComptypeIsNotNull() {
            addCriterion("sup_comptype is not null");
            return (Criteria) this;
        }

        public Criteria andSupComptypeEqualTo(String value) {
            addCriterion("sup_comptype =", value, "supComptype");
            return (Criteria) this;
        }

        public Criteria andSupComptypeNotEqualTo(String value) {
            addCriterion("sup_comptype <>", value, "supComptype");
            return (Criteria) this;
        }

        public Criteria andSupComptypeGreaterThan(String value) {
            addCriterion("sup_comptype >", value, "supComptype");
            return (Criteria) this;
        }

        public Criteria andSupComptypeGreaterThanOrEqualTo(String value) {
            addCriterion("sup_comptype >=", value, "supComptype");
            return (Criteria) this;
        }

        public Criteria andSupComptypeLessThan(String value) {
            addCriterion("sup_comptype <", value, "supComptype");
            return (Criteria) this;
        }

        public Criteria andSupComptypeLessThanOrEqualTo(String value) {
            addCriterion("sup_comptype <=", value, "supComptype");
            return (Criteria) this;
        }

        public Criteria andSupComptypeLike(String value) {
            addCriterion("sup_comptype like", value, "supComptype");
            return (Criteria) this;
        }

        public Criteria andSupComptypeNotLike(String value) {
            addCriterion("sup_comptype not like", value, "supComptype");
            return (Criteria) this;
        }

        public Criteria andSupComptypeIn(List<String> values) {
            addCriterion("sup_comptype in", values, "supComptype");
            return (Criteria) this;
        }

        public Criteria andSupComptypeNotIn(List<String> values) {
            addCriterion("sup_comptype not in", values, "supComptype");
            return (Criteria) this;
        }

        public Criteria andSupComptypeBetween(String value1, String value2) {
            addCriterion("sup_comptype between", value1, value2, "supComptype");
            return (Criteria) this;
        }

        public Criteria andSupComptypeNotBetween(String value1, String value2) {
            addCriterion("sup_comptype not between", value1, value2, "supComptype");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}