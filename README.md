# mv-documentos-api

Para iniciar, entrar no diretório em que a aplicação se encontra e executar o seguinte comando no terminal "mvn spring-boot:run" 
O banco de dados utilizado é mysql, portanto para o acesso, será necessário criar a db mvdocumentos. As credenciais pode ser a sua, porém será necessário alterar o datasource da aplicação.
A aplicação usa o flyway, então uma vez com a db criada, as tabelas serão criadas automaticamente. 

Após esses passos, a aplicação estará pronta para ser utilizada. Contém todos os métodos de crud. 

Poderá ser realizado os testes com o postman ou similar ou com o front-end que se encontra aqui: https://github.com/joao0212/mv-documentos-ui
