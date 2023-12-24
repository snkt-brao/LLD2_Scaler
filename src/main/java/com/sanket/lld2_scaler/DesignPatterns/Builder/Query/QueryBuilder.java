package com.sanket.lld2_scaler.DesignPatterns.Builder.Query;

public class QueryBuilder {

    private String select;
    private String from;
    private String where;
    private String join;
    private String orderBy;
    private String groupBy;


    private QueryBuilder(Builder builder) {
        this.select = builder.getSelect();
        this.from = builder.getFrom();
        this.join = builder.getJoin();
        this.orderBy = builder.getOrderBy();
        this.groupBy = builder.getGroupBy();
    }


    public static class Builder {

        private String select;
        private String from;
        private String where;
        private String join;
        private String orderBy;
        private String groupBy;

        public String getGroupBy() {
            return groupBy;
        }

        public void setGroupBy(String groupBy) {
            this.groupBy = groupBy;
        }

        public QueryBuilder build() {
            return new QueryBuilder(this);
        }

        public String getSelect() {
            return select;
        }

        public void setSelect(String select) {
            this.select = select;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getWhere() {
            return where;
        }

        public void setWhere(String where) {
            this.where = where;
        }

        public String getJoin() {
            return join;
        }

        public void setJoin(String join) {
            this.join = join;
        }

        public String getOrderBy() {
            return orderBy;
        }

        public void setOrderBy(String orderBy) {
            this.orderBy = orderBy;
        }
    }
}
