<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <div id="greeting">
        <h5>
            <s:property value="#session['clientAccount'].login"/>
        </h5>
        Welcome to the "eBanking | Call Center"
    </div>

    <div>
        <table class="table table-condensed table-bordered" id="clients">
            <caption>Clients</caption>
            <thead>
            <tr>
                <th>#</th>
                <th>Firstname</th>
                <th>Middlename</th>
                <th>Lastname</th>
                <th>Date of birth</th>
                <th>Personal code</th>
                <th>Secret word</th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <s:iterator value="#session['retrieveClientForm'].clients" var="client" status="index">
                <tr>
                    <td>
                        <s:property value="#index.index + 1"/>
                    </td>
                    <td>
                        <s:property value="#client.firstname"/>
                    </td>
                    <td>
                        <s:property value="#client.middlename"/>
                    </td>
                    <td>
                        <s:property value="#client.lastname"/>
                    </td>
                    <td>
                        <s:date name="#client.dateOfBirth" format="dd-MM-yyyy" />
                    </td>
                    <td>
                        <s:property value="#client.personalCode"/>
                    </td>
                    <td>
                        <s:property value="#client.secretWord"/>
                    </td>

                    <td>
                        Contacts
                    </td>
                    <td>
                        Account
                    </td>
                    <td>
                        <s:url action="editClient" var="editClientUrl">
                            <s:param name="id">
                                <s:property value="#client.clientId"/>
                            </s:param>
                        </s:url>
                        <s:a href="%{editClientUrl}">Edit</s:a>
                    </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
    </div>
</div>