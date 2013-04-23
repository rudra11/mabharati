<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>

<script src="jquery-1.9.1.min.js"></script>
</head>
<body>
<table border ="1"cellpadding="2" cellspacing="2" align="center" Style="height:100%; width: 100%;">
    <tr  Style="height:10%">
        <td colspan="2"><tiles:insertAttribute name="header" />
        </td>
    </tr>
    
    <tr  Style="height:70%">
        <td Style="width:20%"><tiles:insertAttribute name="menu" /></td>
        <td Style="width:80%"><tiles:insertAttribute name="body" /></td>
    </tr>
    <tr Style="height:10%">
        <td height="30" colspan="2"><tiles:insertAttribute name="footer" />
        </td>
    </tr>
</table>
</body>
</html>