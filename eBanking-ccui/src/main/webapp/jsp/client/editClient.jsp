<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <div id="greeting">
        <h5>
            Hello, <s:property value="#session['clientAccount'].login"/>
        </h5>
        Welcome to the "eBanking | Call Center"
    </div>

    <div>

        <script type="text/javascript">
            $(function() {
                $( "#dateView" ).datepicker({
                    showOn: "button",
                    buttonImage: "../../img/calendar.gif",
                    buttonImageOnly: true,
                    changeMonth: true,
                    changeYear: true,
                    maxDate: new Date()
                });
            });
            $(document).ready(function(){
                jQuery.validator.addMethod("mobileBYIso", function(value, element){
                            return /^\+375((44)|(33)|(29)|(25))\d{3,}$/.test(value);
                        },
                        "Wrong phone number, please check");
                $("#editForm").validate({
                    rules: {
                        personalCode: {
                            required: true,
                            rangelength: [13, 13]
                        },
                        mobile: {
                            mobileBYIso: true
                        },
                        phone: {
                            mobileBYIso: true
                        },
                        email: {
                            email: true
                        }
                    }
                });
            });
        </script>

        <s:form action="/saveClient" method="post" cssClass="editForm" id="editForm">

            <td colspan="2"><h6>Personal info</h6></td>
            <s:textfield value="%{#session.editClientForm.client.firstname}" label="Firstname" name="firstname"/>
            <s:textfield value="%{#session.editClientForm.client.middlename}" label="Middlename" key="middlename"/>
            <s:textfield value="%{#session.editClientForm.client.lastname}" label="Lastname" key="lastname"/>

            <s:date name='#session.editClientForm.client.dateOfBirth' format='MM/dd/yyyy' var="date"/>
            <s:textfield value="%{date}" label="Date of birth" key="dateOfBirth" id="dateView"/>

            <s:textfield value="%{#session.editClientForm.client.personalCode}" label="Personal code" key="personalCode"/>
            <s:textfield value="%{#session.editClientForm.client.secretWord}" label="Secret word" key="secretWord"/>

            <td colspan="2"><h6>Contact info</h6></td>
            <s:textfield value="%{#session.editClientForm.client.mobileNumber}" label="Mobile number" name="mobile"/>
            <s:textfield value="%{#session.editClientForm.client.mobileNumber}" label="Phone number" name="phone"/>
            <s:textfield value="%{#session.editClientForm.client.email}" label="Email" name="email"/>

            <s:submit value="Save" cssClass="btn btn-primary"/>
        </s:form>
    </div>
</div>