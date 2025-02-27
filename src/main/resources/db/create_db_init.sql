

create table t_team
(
    id uuid default gen_random_uuid() not null
        primary key,
    name             varchar(20),
    product          varchar(10),
    created_at       timestamp,
    modified_at      timestamp default now(),
    default_location varchar(10)
);
CREATE SEQUENCE IF NOT EXISTS SEQ_TEAM_ID;

create table t_rack
(
    id uuid      default gen_random_uuid() not null
        primary key,
    serial_number    varchar(255)
        unique,
    team_id          uuid
        references t_team,
    default_location varchar(255),
    created_at       timestamp default now(),
    status           VARCHAR(255),
    modified_at      timestamp default now()
);
CREATE SEQUENCE IF NOT EXISTS SEQ_RACK_ID;

create table t_rack_asset
(
    id        uuid default gen_random_uuid() not null
        primary key,
    asset_tag varchar(255),
    rack_id   uuid
        references t_rack,
    created_at       timestamp default now(),
    modified_at      timestamp default now()
);
CREATE SEQUENCE IF NOT EXISTS SEQ_RACK_ASSET_ID;

create table t_team_member
(
    id          uuid      default gen_random_uuid() not null
        primary key,
    team_id     uuid      default gen_random_uuid() not null
        references t_team,
    ctw_id      varchar(10),
    name        varchar(20),
    created_at  timestamp,
    modified_at timestamp default now()
);

create table t_booking
(
    id uuid  default gen_random_uuid() not null,
    rack_id      uuid
        references t_rack,
    requester_id uuid
        references t_team,
    book_from    timestamp,
    book_to      timestamp,
    created_at   timestamp,
    modified_at  timestamp default now()
);
CREATE SEQUENCE IF NOT EXISTS SEQ_BOOKING_ID;






