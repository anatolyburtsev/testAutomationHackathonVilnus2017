#language:ru

Функционал: Поиск репозиториев в github

  Структура сценария: Поиск репозиториев в github по ключевому слову
    Пусть совершен переход на страницу "Страница входа GitHub" по ссылке из property файла "gitHubMainPage"
    И в поле "Поиск" введено значение "<searchQuery>"
    И выполнено нажатие на клавиатуре "Enter"
    Тогда страница "Репозитории" загрузилась
    Когда выполнен GET запрос на URL "{repositorySearchUrl}<searchQuery>". Полученный ответ сохранен в переменную "<searchResultVariable>"
    Тогда список репозиториев на странице соответствует ответу сервиса из переменной "<searchResultVariable>"

    Примеры:
      | searchQuery | searchResultVariable     |
      | alfalab     | repositoriesSearchResult |