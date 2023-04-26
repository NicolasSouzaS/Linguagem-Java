SELECT * FROM atividade.chamados;

SELECT departamento, count(departamento) AS `Departamentos contados` from chamados GROUP BY departamento HAVING `statusChamado` = "Pendente";