insert into s_user (id, username, password, fullname, email, nomor_hp)
values ('u001', 'user001', 'u00123', 'User 001', 'u001@example.com', '0812345678901');

insert into s_user (id, username, password, fullname, email, nomor_hp)
values ('u002', 'user002', 'u00123', 'User 002', 'u002@example.com', '0812345678902');

insert into s_user (id, username, password, fullname, email, nomor_hp)
values ('u003', 'user003', 'u00123', 'User 003', 'u003@example.com', '0812345678903');

insert into s_user (id, username, password, fullname, email, nomor_hp)
values ('u004', 'user004', 'u00123', 'User 004', 'u004@example.com', '0812345678904');

insert into s_user (id, username, password, fullname, email, nomor_hp)
values ('u005', 'user005', 'u00123', 'User 005', 'u005@example.com', '0812345678905');


insert into s_permission (id, name, description)
values ('p001', 'USER_EDIT', 'Add / Remove User');

insert into s_permission (id, name, description)
values ('p002', 'USER_VIEW', 'View User');

insert into s_role (id, name, description)
values ('r001', 'Admin', 'Administrator');

insert into s_role (id, name, description)
values ('r002', 'Staff', 'Staff');

insert into s_user_role (id_user, id_role)
values ('u001', 'r001');

insert into s_user_role (id_user, id_role)
values ('u002', 'r002');

insert into s_role_permission (id_role, id_permission)
values ('r001', 'p001');

insert into s_role_permission (id_role, id_permission)
values ('r001', 'p002');

insert into s_role_permission (id_role, id_permission)
values ('r002', 'p002');


update s_user set password='$2a$10$i8rKKswq.cv1AImFFdr36eZzc66X0HA3WB015X5zROYjVvsFzMe2y';
commit;

insert into stl (id, harga_emas, harga_perak, tanggal_berlaku, keterangan) 
values ('h1', 550, 200, '2017-01-01','harga h1');

insert into stl (id, harga_emas, harga_perak, tanggal_berlaku, keterangan) 
values ('h2', 550, 200, '2017-02-01','harga h2');

insert into stl (id, harga_emas, harga_perak, tanggal_berlaku, keterangan) 
values ('h3', 550, 200, '2017-03-01','harga h3');

insert into stl (id, harga_emas, harga_perak, tanggal_berlaku, keterangan) 
values ('h4', 550, 200, '2017-04-01','harga h4');



