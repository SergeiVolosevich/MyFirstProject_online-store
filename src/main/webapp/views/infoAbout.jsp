<div class="form-group">
                                    <form:label path ="name"><spring:message code="name"/></form:label>
                                        <spring:message code="name" var="name_placeholder"/>
                                    <form:input class="form-control" path ="name" placeholder="${name_placeholder}"/>
                                    <small class="form-text text-muted"><spring:message code="name_help"/></small>

                                            <form:errors path="name" class="text-danger"/>

                                </div>

                                <div class="form-group">
                                    <form:label path = "surname"><spring:message code="surname"/></form:label>
                                        <spring:message code="surname" var="surname_placeholder"/>
                                    <form:input class="form-control" path ="surname" placeholder="${surname_placeholder}"/>
                                    <small class="form-text text-muted"><spring:message code="surname_help"/></small>

                                            <form:errors path="surname" class="text-danger"/>

                                </div>

                                <div class="form-group">
                                    <form:label path = "patronymic"><spring:message code="patronymic"/></form:label>
                                    <spring:message code="patronymic" var="patronymic_placeholder"/>
                                    <form:input class="form-control" path ="patronymic" placeholder="${patronymic_placeholder}"/>
                                    <small class="form-text text-muted"><spring:message code="patronimic_help"/></small>

                                            <form:errors path="patronymic" class="text-danger"/>

                                </div>

                                <div class="form-group">
                                    <div>
                                        <form:label path = "sex"><spring:message code="sex"/></form:label></td>
                                    </div>
                                    <div class="custom-control custom-radio">
                                        <form:radiobutton  path = "sex" value = "M" label = "Male" />
                                        <form:radiobutton  path = "sex" value = "F" label = "Female" />

                                    </div>

                                          <form:errors path="sex" class="text-danger"/>

                                </div>
                                <div class="form-group">
                                     <form:label path = "birthdayDate"><spring:message code="birthday"/></form:label>
                                     <spring:message code="birthday" var="birthday_placeholder"/>
                                     <form:input class="form-control" path ="birthdayDate" placeholder="${birthday_placeholder}"/>
                                     <small class="form-text text-muted"><spring:message code="birthday_help"/></small>

                                            <form:errors path="birthdayDate" class="text-danger"/>

                                </div>