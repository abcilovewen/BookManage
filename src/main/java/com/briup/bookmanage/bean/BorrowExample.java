package com.briup.bookmanage.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andReaderIdIsNull() {
            addCriterion("reader_id is null");
            return (Criteria) this;
        }

        public Criteria andReaderIdIsNotNull() {
            addCriterion("reader_id is not null");
            return (Criteria) this;
        }

        public Criteria andReaderIdEqualTo(Integer value) {
            addCriterion("reader_id =", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdNotEqualTo(Integer value) {
            addCriterion("reader_id <>", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdGreaterThan(Integer value) {
            addCriterion("reader_id >", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reader_id >=", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdLessThan(Integer value) {
            addCriterion("reader_id <", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdLessThanOrEqualTo(Integer value) {
            addCriterion("reader_id <=", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdIn(List<Integer> values) {
            addCriterion("reader_id in", values, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdNotIn(List<Integer> values) {
            addCriterion("reader_id not in", values, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdBetween(Integer value1, Integer value2) {
            addCriterion("reader_id between", value1, value2, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reader_id not between", value1, value2, "readerId");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBDateIsNull() {
            addCriterion("B_date is null");
            return (Criteria) this;
        }

        public Criteria andBDateIsNotNull() {
            addCriterion("B_date is not null");
            return (Criteria) this;
        }

        public Criteria andBDateEqualTo(Date value) {
            addCriterion("B_date =", value, "bDate");
            return (Criteria) this;
        }

        public Criteria andBDateNotEqualTo(Date value) {
            addCriterion("B_date <>", value, "bDate");
            return (Criteria) this;
        }

        public Criteria andBDateGreaterThan(Date value) {
            addCriterion("B_date >", value, "bDate");
            return (Criteria) this;
        }

        public Criteria andBDateGreaterThanOrEqualTo(Date value) {
            addCriterion("B_date >=", value, "bDate");
            return (Criteria) this;
        }

        public Criteria andBDateLessThan(Date value) {
            addCriterion("B_date <", value, "bDate");
            return (Criteria) this;
        }

        public Criteria andBDateLessThanOrEqualTo(Date value) {
            addCriterion("B_date <=", value, "bDate");
            return (Criteria) this;
        }

        public Criteria andBDateIn(List<Date> values) {
            addCriterion("B_date in", values, "bDate");
            return (Criteria) this;
        }

        public Criteria andBDateNotIn(List<Date> values) {
            addCriterion("B_date not in", values, "bDate");
            return (Criteria) this;
        }

        public Criteria andBDateBetween(Date value1, Date value2) {
            addCriterion("B_date between", value1, value2, "bDate");
            return (Criteria) this;
        }

        public Criteria andBDateNotBetween(Date value1, Date value2) {
            addCriterion("B_date not between", value1, value2, "bDate");
            return (Criteria) this;
        }

        public Criteria andRDateIsNull() {
            addCriterion("R_date is null");
            return (Criteria) this;
        }

        public Criteria andRDateIsNotNull() {
            addCriterion("R_date is not null");
            return (Criteria) this;
        }

        public Criteria andRDateEqualTo(Date value) {
            addCriterion("R_date =", value, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateNotEqualTo(Date value) {
            addCriterion("R_date <>", value, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateGreaterThan(Date value) {
            addCriterion("R_date >", value, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateGreaterThanOrEqualTo(Date value) {
            addCriterion("R_date >=", value, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateLessThan(Date value) {
            addCriterion("R_date <", value, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateLessThanOrEqualTo(Date value) {
            addCriterion("R_date <=", value, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateIn(List<Date> values) {
            addCriterion("R_date in", values, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateNotIn(List<Date> values) {
            addCriterion("R_date not in", values, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateBetween(Date value1, Date value2) {
            addCriterion("R_date between", value1, value2, "rDate");
            return (Criteria) this;
        }

        public Criteria andRDateNotBetween(Date value1, Date value2) {
            addCriterion("R_date not between", value1, value2, "rDate");
            return (Criteria) this;
        }

        public Criteria andIfbackIsNull() {
            addCriterion("ifback is null");
            return (Criteria) this;
        }

        public Criteria andIfbackIsNotNull() {
            addCriterion("ifback is not null");
            return (Criteria) this;
        }

        public Criteria andIfbackEqualTo(Byte value) {
            addCriterion("ifback =", value, "ifback");
            return (Criteria) this;
        }

        public Criteria andIfbackNotEqualTo(Byte value) {
            addCriterion("ifback <>", value, "ifback");
            return (Criteria) this;
        }

        public Criteria andIfbackGreaterThan(Byte value) {
            addCriterion("ifback >", value, "ifback");
            return (Criteria) this;
        }

        public Criteria andIfbackGreaterThanOrEqualTo(Byte value) {
            addCriterion("ifback >=", value, "ifback");
            return (Criteria) this;
        }

        public Criteria andIfbackLessThan(Byte value) {
            addCriterion("ifback <", value, "ifback");
            return (Criteria) this;
        }

        public Criteria andIfbackLessThanOrEqualTo(Byte value) {
            addCriterion("ifback <=", value, "ifback");
            return (Criteria) this;
        }

        public Criteria andIfbackIn(List<Byte> values) {
            addCriterion("ifback in", values, "ifback");
            return (Criteria) this;
        }

        public Criteria andIfbackNotIn(List<Byte> values) {
            addCriterion("ifback not in", values, "ifback");
            return (Criteria) this;
        }

        public Criteria andIfbackBetween(Byte value1, Byte value2) {
            addCriterion("ifback between", value1, value2, "ifback");
            return (Criteria) this;
        }

        public Criteria andIfbackNotBetween(Byte value1, Byte value2) {
            addCriterion("ifback not between", value1, value2, "ifback");
            return (Criteria) this;
        }

        public Criteria andFineIsNull() {
            addCriterion("fine is null");
            return (Criteria) this;
        }

        public Criteria andFineIsNotNull() {
            addCriterion("fine is not null");
            return (Criteria) this;
        }

        public Criteria andFineEqualTo(Double value) {
            addCriterion("fine =", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotEqualTo(Double value) {
            addCriterion("fine <>", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineGreaterThan(Double value) {
            addCriterion("fine >", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineGreaterThanOrEqualTo(Double value) {
            addCriterion("fine >=", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineLessThan(Double value) {
            addCriterion("fine <", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineLessThanOrEqualTo(Double value) {
            addCriterion("fine <=", value, "fine");
            return (Criteria) this;
        }

        public Criteria andFineIn(List<Double> values) {
            addCriterion("fine in", values, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotIn(List<Double> values) {
            addCriterion("fine not in", values, "fine");
            return (Criteria) this;
        }

        public Criteria andFineBetween(Double value1, Double value2) {
            addCriterion("fine between", value1, value2, "fine");
            return (Criteria) this;
        }

        public Criteria andFineNotBetween(Double value1, Double value2) {
            addCriterion("fine not between", value1, value2, "fine");
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