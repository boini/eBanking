<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div>
    <div id="greeting">
        <h5>
            Hello, <s:property value="#session['clientAccount'].login"/>
        </h5>
        Edit client info
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
                            return /^\+375((44)|(33)|(29)|(25))\d{3,7}$/.test(value);
                        },
                        "Wrong phone number, please check");
                jQuery.validator.addMethod("phoneBYIso", function(value, element){
                            return /^\+375\d{9,10}$/.test(value);
                        },
                        "Wrong phone number, please check");
                $("#editForm").validate({
                    submitHandler: function(form) {
                        $('.submit-form-btn').attr('disabled', true);
                        $(form).submit();
                    },
                    rules: {
                        firstname:{
                            required: true
                        },
                        middlename:{
                            required: true
                        },
                        lastname:{
                            required: true
                        },
                        dateOfBirth:{
                            required: true,
                            date: true
                        },
                        personalCode: {
                            required: true,
                            minlength: 13,
                            maxlength: 13
                        },
                        secretWord:{
                            required: true
                        },
                        mobileNumber: {
                            mobileBYIso: true
                        },
                        phoneNumber: {
                            phoneBYIso: true
                        },
                        email: {
                            required: true,
                            email: true
                        }
                    }
                });
            });
        </script>

        <s:form action="/saveClient" method="post" cssClass="editForm" id="editForm">

            <td colspan="2"><h6 style="width: 389px;">Personal info</h6></td>
            <s:textfield value="%{#session.editClientForm.client.firstname}" label="Firstname" name="firstname"/>
            <s:textfield value="%{#session.editClientForm.client.middlename}" label="Middlename" key="middlename"/>
            <s:textfield value="%{#session.editClientForm.client.lastname}" label="Lastname" key="lastname"/>

            <s:date name='#session.editClientForm.client.dateOfBirth' format='MM/dd/yyyy' var="date"/>
            <s:textfield value="%{date}" label="Date of birth" key="dateOfBirth" id="dateView"/>

            <s:textfield value="%{#session.editClientForm.client.personalCode}" label="Personal code" key="personalCode"/>
            <s:textfield value="%{#session.editClientForm.client.secretWord}" label="Secret word" key="secretWord"/>

            <td colspan="2"><h6 style="width: 389px;">Contact info</h6></td>
            <s:textfield value="%{#session.editClientForm.client.mobileNumber}" label="Mobile number" name="mobileNumber"/>
            <s:textfield value="%{#session.editClientForm.client.mobileNumber}" label="Phone number" name="phoneNumber"/>
            <s:textfield value="%{#session.editClientForm.client.email}" label="Email" name="email"/>

            <s:submit value="Save" cssClass="btn btn-primary submit-form-btn" style="float: left; margin-left:200px;" />
        </s:form>
    </div>
</div>