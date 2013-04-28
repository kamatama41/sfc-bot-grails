<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
<head>
    <meta name="layout" content="main"/>
    <title>SuperFamicom BOT</title>
</head>

<body>
<h3><g:link url="https://twitter.com/SuperFamicomBot">@superfamicom_bot</g:link> タイトル一覧</h3>
<table class="table table-bordered table-striped table-condensed">
    <thead>
    <tr>
        <th style="width: 35%">タイトル</th>
        <th style="width: 35%">販売元</th>
        <th style="width: 15%">発売日</th>
        <th style="width: 15%">価格</th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${softwareList}" var="software">
    <tr>
        <td><g:link url="${software.googleSearchUrl}">${software.title}</g:link></td>
        <td>${software.publisher}</td>
        <td><g:formatDate date="${software.release}" format="yyyy/MM/dd"/></td>
        <td>${software.price}円</td>
    </tr>
    </g:each>
    </tbody>
</table>
</body>
</html>