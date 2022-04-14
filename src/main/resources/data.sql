-- Script d'initialisation des données de la base H2 --

--Equipe 2019
INSERT INTO TEAM (id, coach, year) VALUES (nextval('SEQ_TEAM'), 'Dominique Ducharme', 2019);

INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 31, 'Carey', 'Price',
                                                                                             'goaltender',
                                                                              false, currval('SEQ_TEAM'));
INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 14, 'Nick', 'Suzuki',
                                                                                              'forward',
                                                                                   false, currval('SEQ_TEAM'));
INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 15, 'Jesperi',
                                                                                              'Kotkaniemi', 'forward',
                                                                                   false, currval('SEQ_TEAM'));
INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 71, 'Jake', 'Evans',
                                                                                              'forward',
                                                                                   false, currval('SEQ_TEAM'));
INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 27, 'Alexander',
                                                                                              'Romanov', 'defenseman',
                                                                                   false, currval('SEQ_TEAM'));
INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 6, 'Shea', 'Weber',
                                                                                   'defenseman',
                                                                                   true, currval('SEQ_TEAM'));
--Equipe 2020
INSERT INTO TEAM (id, coach, year) VALUES (nextval('SEQ_TEAM'), 'Dominique Ducharme', 2020);


INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 31, 'Carey', 'Price',
                                                                                              'goaltender',
                                                                                   false, currval('SEQ_TEAM'));
INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 14, 'Nick', 'Suzuki',
                                                                                              'forward',
                                                                                   false, currval('SEQ_TEAM'));
INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 15, 'Jesperi',
                                                                                              'Kotkaniemi', 'forward',
                                                                                   false, currval('SEQ_TEAM'));
INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 71, 'Jake', 'Evans',
                                                                                              'forward',
                                                                                   false, currval('SEQ_TEAM'));
INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 27, 'Alexander',
                                                                                              'Romanov', 'defenseman',
                                                                                   false, currval('SEQ_TEAM'));
INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 6, 'Shea', 'Weber',
                                                                                   'defenseman',
                                                                                   true, currval('SEQ_TEAM'));
--Equipe 2021
INSERT INTO TEAM (id, coach, year) VALUES (nextval('SEQ_TEAM'), 'Dominique Ducharme', 2021);

INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 31, 'Carey', 'Price',
                                                                                              'goaltender',
                                                                                              false, currval('SEQ_TEAM'));
INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 14, 'Nick', 'Suzuki',
                                                                                              'forward',
                                                                                              false, currval('SEQ_TEAM'));
INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 15, 'Jesperi',
                                                                                              'Kotkaniemi', 'forward',
                                                                                              false, currval('SEQ_TEAM'));
INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 71, 'Jake', 'Evans',
                                                                                              'forward',
                                                                                              false, currval('SEQ_TEAM'));
INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 27, 'Alexander',
                                                                                              'Romanov', 'defenseman',
                                                                                              false, currval('SEQ_TEAM'));
INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 6, 'Shea', 'Weber',
                                                                                              'defenseman',
                                                                                              true, currval('SEQ_TEAM'));
--Equipe 2022
INSERT INTO TEAM (id, coach, year) VALUES (nextval('SEQ_TEAM'), 'Dominique Ducharme', 2022);

INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 31, 'Carey', 'Price',
                                                                                              'goaltender',
                                                                                              false, currval('SEQ_TEAM'));
INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 14, 'Nick', 'Suzuki',
                                                                                              'forward',
                                                                                              false, currval('SEQ_TEAM'));
INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 15, 'Jesperi',
                                                                                              'Kotkaniemi', 'forward',
                                                                                              false, currval('SEQ_TEAM'));
INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 71, 'Jake', 'Evans',
                                                                                              'forward',
                                                                                              false, currval('SEQ_TEAM'));
INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 27, 'Alexander',
                                                                                              'Romanov', 'defenseman',
                                                                                              false, currval('SEQ_TEAM'));
INSERT INTO PLAYER (id_player, number, name, lastname, position, is_Captain, id_team) VALUES (nextval('SEQ_PLAYER'), 6, 'Shea', 'Weber',
                                                                                              'defenseman',
                                                                                              true, currval('SEQ_TEAM'));