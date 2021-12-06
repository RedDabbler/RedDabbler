create table _t_bill_history
(
    id     varchar(32) not null
        constraint _t_bill_history_pk
            primary key,
    source integer default 0,
    type   integer default 0,
    money  double precision,
    descp  varchar(255)
);

comment on table _t_bill_history is '账单历史记录表';

comment on column _t_bill_history.source is '账单来源';

comment on column _t_bill_history.type is '收入还是支出';

comment on column _t_bill_history.money is '金额';

comment on column _t_bill_history.descp is '描述';

alter table _t_bill_history
    owner to postgres;

create unique index _t_bill_history_id_uindex
    on _t_bill_history (id);

