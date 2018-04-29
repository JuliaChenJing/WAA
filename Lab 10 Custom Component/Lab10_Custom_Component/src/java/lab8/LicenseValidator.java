/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("licenseValidator")
public class LicenseValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        Pattern pattern = Pattern.compile("[A-Z]{2}[-][0-9]{2}[-][A-Z]{2}");
        String license = (String) value;
        Matcher matcher = pattern.matcher(license);
        if (!matcher.matches()) {
            // does not match
            FacesMessage message = new FacesMessage();
            message.setDetail("Licence plate is not valid");
            message.setSummary("Licence plate is not valid");
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message);
        }
    }

}
