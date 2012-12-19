<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <div id="greeting">
        <h5>
            Hello, <s:property value="#session['clientAccount'].login"/>
        </h5>
        All clients
    </div>

    <div>
        <s:url action="addClient" var="addClientUrl">
        </s:url>
        <s:a cssClass="btn btn-mini btn-success" href="%{addClientUrl}"><i class="icon-plus"></i> Add client</s:a>

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
                <th>Mobile number</th>
                <th>Phone number</th>
                <th>Email</th>
                <th width="73"></th>
                <th width="50"></th>
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
                        <s:property value="#client.mobileNumber"/>
                    </td>
                    <td>
                        <s:property value="#client.phoneNumber"/>
                    </td>
                    <td>
                        <s:property value="#client.email"/>
                    </td>
                    <td>
                        <s:url action="viewAccount" var="viewAccountUrl">
                            <s:param name="id">
                                <s:property value="#client.clientId"/>
                            </s:param>
                        </s:url>
                        <s:a cssClass="btn btn-mini btn-success" href="%{viewAccountUrl}"><i class="icon-user"></i> Account</s:a>
                    </td>
                    <td>
                        <s:url action="editClient" var="editClientUrl">
                            <s:param name="id">
                                <s:property value="#client.clientId"/>
                            </s:param>
                        </s:url>
                        <s:a cssClass="btn btn-mini btn-primary" href="%{editClientUrl}"><i class="icon-pencil"></i> Edit</s:a>
                    </td>
                </tr>
            </s:iterator>
            </tbody>
        </table>
    </div>
</div>