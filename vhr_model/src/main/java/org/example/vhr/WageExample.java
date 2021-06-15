package org.example.vhr;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WageExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andUidIsNull() {
            addCriterion("`uid` is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("`uid` is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("`uid` =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("`uid` <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("`uid` >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("`uid` >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("`uid` <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("`uid` <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("`uid` in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("`uid` not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("`uid` between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("`uid` not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andSalaryIdIsNull() {
            addCriterion("salary_id is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIdIsNotNull() {
            addCriterion("salary_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryIdEqualTo(Integer value) {
            addCriterion("salary_id =", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotEqualTo(Integer value) {
            addCriterion("salary_id <>", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdGreaterThan(Integer value) {
            addCriterion("salary_id >", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("salary_id >=", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdLessThan(Integer value) {
            addCriterion("salary_id <", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdLessThanOrEqualTo(Integer value) {
            addCriterion("salary_id <=", value, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdIn(List<Integer> values) {
            addCriterion("salary_id in", values, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotIn(List<Integer> values) {
            addCriterion("salary_id not in", values, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdBetween(Integer value1, Integer value2) {
            addCriterion("salary_id between", value1, value2, "salaryId");
            return (Criteria) this;
        }

        public Criteria andSalaryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("salary_id not between", value1, value2, "salaryId");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryIsNull() {
            addCriterion("base_salary is null");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryIsNotNull() {
            addCriterion("base_salary is not null");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryEqualTo(Double value) {
            addCriterion("base_salary =", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotEqualTo(Double value) {
            addCriterion("base_salary <>", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryGreaterThan(Double value) {
            addCriterion("base_salary >", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("base_salary >=", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryLessThan(Double value) {
            addCriterion("base_salary <", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryLessThanOrEqualTo(Double value) {
            addCriterion("base_salary <=", value, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryIn(List<Double> values) {
            addCriterion("base_salary in", values, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotIn(List<Double> values) {
            addCriterion("base_salary not in", values, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryBetween(Double value1, Double value2) {
            addCriterion("base_salary between", value1, value2, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andBaseSalaryNotBetween(Double value1, Double value2) {
            addCriterion("base_salary not between", value1, value2, "baseSalary");
            return (Criteria) this;
        }

        public Criteria andProjectBonusIsNull() {
            addCriterion("project_bonus is null");
            return (Criteria) this;
        }

        public Criteria andProjectBonusIsNotNull() {
            addCriterion("project_bonus is not null");
            return (Criteria) this;
        }

        public Criteria andProjectBonusEqualTo(Double value) {
            addCriterion("project_bonus =", value, "projectBonus");
            return (Criteria) this;
        }

        public Criteria andProjectBonusNotEqualTo(Double value) {
            addCriterion("project_bonus <>", value, "projectBonus");
            return (Criteria) this;
        }

        public Criteria andProjectBonusGreaterThan(Double value) {
            addCriterion("project_bonus >", value, "projectBonus");
            return (Criteria) this;
        }

        public Criteria andProjectBonusGreaterThanOrEqualTo(Double value) {
            addCriterion("project_bonus >=", value, "projectBonus");
            return (Criteria) this;
        }

        public Criteria andProjectBonusLessThan(Double value) {
            addCriterion("project_bonus <", value, "projectBonus");
            return (Criteria) this;
        }

        public Criteria andProjectBonusLessThanOrEqualTo(Double value) {
            addCriterion("project_bonus <=", value, "projectBonus");
            return (Criteria) this;
        }

        public Criteria andProjectBonusIn(List<Double> values) {
            addCriterion("project_bonus in", values, "projectBonus");
            return (Criteria) this;
        }

        public Criteria andProjectBonusNotIn(List<Double> values) {
            addCriterion("project_bonus not in", values, "projectBonus");
            return (Criteria) this;
        }

        public Criteria andProjectBonusBetween(Double value1, Double value2) {
            addCriterion("project_bonus between", value1, value2, "projectBonus");
            return (Criteria) this;
        }

        public Criteria andProjectBonusNotBetween(Double value1, Double value2) {
            addCriterion("project_bonus not between", value1, value2, "projectBonus");
            return (Criteria) this;
        }

        public Criteria andJobsYearBonusIsNull() {
            addCriterion("jobs_year_bonus is null");
            return (Criteria) this;
        }

        public Criteria andJobsYearBonusIsNotNull() {
            addCriterion("jobs_year_bonus is not null");
            return (Criteria) this;
        }

        public Criteria andJobsYearBonusEqualTo(Double value) {
            addCriterion("jobs_year_bonus =", value, "jobsYearBonus");
            return (Criteria) this;
        }

        public Criteria andJobsYearBonusNotEqualTo(Double value) {
            addCriterion("jobs_year_bonus <>", value, "jobsYearBonus");
            return (Criteria) this;
        }

        public Criteria andJobsYearBonusGreaterThan(Double value) {
            addCriterion("jobs_year_bonus >", value, "jobsYearBonus");
            return (Criteria) this;
        }

        public Criteria andJobsYearBonusGreaterThanOrEqualTo(Double value) {
            addCriterion("jobs_year_bonus >=", value, "jobsYearBonus");
            return (Criteria) this;
        }

        public Criteria andJobsYearBonusLessThan(Double value) {
            addCriterion("jobs_year_bonus <", value, "jobsYearBonus");
            return (Criteria) this;
        }

        public Criteria andJobsYearBonusLessThanOrEqualTo(Double value) {
            addCriterion("jobs_year_bonus <=", value, "jobsYearBonus");
            return (Criteria) this;
        }

        public Criteria andJobsYearBonusIn(List<Double> values) {
            addCriterion("jobs_year_bonus in", values, "jobsYearBonus");
            return (Criteria) this;
        }

        public Criteria andJobsYearBonusNotIn(List<Double> values) {
            addCriterion("jobs_year_bonus not in", values, "jobsYearBonus");
            return (Criteria) this;
        }

        public Criteria andJobsYearBonusBetween(Double value1, Double value2) {
            addCriterion("jobs_year_bonus between", value1, value2, "jobsYearBonus");
            return (Criteria) this;
        }

        public Criteria andJobsYearBonusNotBetween(Double value1, Double value2) {
            addCriterion("jobs_year_bonus not between", value1, value2, "jobsYearBonus");
            return (Criteria) this;
        }

        public Criteria andOtherBonusIsNull() {
            addCriterion("other_bonus is null");
            return (Criteria) this;
        }

        public Criteria andOtherBonusIsNotNull() {
            addCriterion("other_bonus is not null");
            return (Criteria) this;
        }

        public Criteria andOtherBonusEqualTo(Double value) {
            addCriterion("other_bonus =", value, "otherBonus");
            return (Criteria) this;
        }

        public Criteria andOtherBonusNotEqualTo(Double value) {
            addCriterion("other_bonus <>", value, "otherBonus");
            return (Criteria) this;
        }

        public Criteria andOtherBonusGreaterThan(Double value) {
            addCriterion("other_bonus >", value, "otherBonus");
            return (Criteria) this;
        }

        public Criteria andOtherBonusGreaterThanOrEqualTo(Double value) {
            addCriterion("other_bonus >=", value, "otherBonus");
            return (Criteria) this;
        }

        public Criteria andOtherBonusLessThan(Double value) {
            addCriterion("other_bonus <", value, "otherBonus");
            return (Criteria) this;
        }

        public Criteria andOtherBonusLessThanOrEqualTo(Double value) {
            addCriterion("other_bonus <=", value, "otherBonus");
            return (Criteria) this;
        }

        public Criteria andOtherBonusIn(List<Double> values) {
            addCriterion("other_bonus in", values, "otherBonus");
            return (Criteria) this;
        }

        public Criteria andOtherBonusNotIn(List<Double> values) {
            addCriterion("other_bonus not in", values, "otherBonus");
            return (Criteria) this;
        }

        public Criteria andOtherBonusBetween(Double value1, Double value2) {
            addCriterion("other_bonus between", value1, value2, "otherBonus");
            return (Criteria) this;
        }

        public Criteria andOtherBonusNotBetween(Double value1, Double value2) {
            addCriterion("other_bonus not between", value1, value2, "otherBonus");
            return (Criteria) this;
        }

        public Criteria andPositionBonusIsNull() {
            addCriterion("position_bonus is null");
            return (Criteria) this;
        }

        public Criteria andPositionBonusIsNotNull() {
            addCriterion("position_bonus is not null");
            return (Criteria) this;
        }

        public Criteria andPositionBonusEqualTo(Double value) {
            addCriterion("position_bonus =", value, "positionBonus");
            return (Criteria) this;
        }

        public Criteria andPositionBonusNotEqualTo(Double value) {
            addCriterion("position_bonus <>", value, "positionBonus");
            return (Criteria) this;
        }

        public Criteria andPositionBonusGreaterThan(Double value) {
            addCriterion("position_bonus >", value, "positionBonus");
            return (Criteria) this;
        }

        public Criteria andPositionBonusGreaterThanOrEqualTo(Double value) {
            addCriterion("position_bonus >=", value, "positionBonus");
            return (Criteria) this;
        }

        public Criteria andPositionBonusLessThan(Double value) {
            addCriterion("position_bonus <", value, "positionBonus");
            return (Criteria) this;
        }

        public Criteria andPositionBonusLessThanOrEqualTo(Double value) {
            addCriterion("position_bonus <=", value, "positionBonus");
            return (Criteria) this;
        }

        public Criteria andPositionBonusIn(List<Double> values) {
            addCriterion("position_bonus in", values, "positionBonus");
            return (Criteria) this;
        }

        public Criteria andPositionBonusNotIn(List<Double> values) {
            addCriterion("position_bonus not in", values, "positionBonus");
            return (Criteria) this;
        }

        public Criteria andPositionBonusBetween(Double value1, Double value2) {
            addCriterion("position_bonus between", value1, value2, "positionBonus");
            return (Criteria) this;
        }

        public Criteria andPositionBonusNotBetween(Double value1, Double value2) {
            addCriterion("position_bonus not between", value1, value2, "positionBonus");
            return (Criteria) this;
        }

        public Criteria andPerformanceBonusIsNull() {
            addCriterion("performance_bonus is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceBonusIsNotNull() {
            addCriterion("performance_bonus is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceBonusEqualTo(Double value) {
            addCriterion("performance_bonus =", value, "performanceBonus");
            return (Criteria) this;
        }

        public Criteria andPerformanceBonusNotEqualTo(Double value) {
            addCriterion("performance_bonus <>", value, "performanceBonus");
            return (Criteria) this;
        }

        public Criteria andPerformanceBonusGreaterThan(Double value) {
            addCriterion("performance_bonus >", value, "performanceBonus");
            return (Criteria) this;
        }

        public Criteria andPerformanceBonusGreaterThanOrEqualTo(Double value) {
            addCriterion("performance_bonus >=", value, "performanceBonus");
            return (Criteria) this;
        }

        public Criteria andPerformanceBonusLessThan(Double value) {
            addCriterion("performance_bonus <", value, "performanceBonus");
            return (Criteria) this;
        }

        public Criteria andPerformanceBonusLessThanOrEqualTo(Double value) {
            addCriterion("performance_bonus <=", value, "performanceBonus");
            return (Criteria) this;
        }

        public Criteria andPerformanceBonusIn(List<Double> values) {
            addCriterion("performance_bonus in", values, "performanceBonus");
            return (Criteria) this;
        }

        public Criteria andPerformanceBonusNotIn(List<Double> values) {
            addCriterion("performance_bonus not in", values, "performanceBonus");
            return (Criteria) this;
        }

        public Criteria andPerformanceBonusBetween(Double value1, Double value2) {
            addCriterion("performance_bonus between", value1, value2, "performanceBonus");
            return (Criteria) this;
        }

        public Criteria andPerformanceBonusNotBetween(Double value1, Double value2) {
            addCriterion("performance_bonus not between", value1, value2, "performanceBonus");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("`status` not between", value1, value2, "status");
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