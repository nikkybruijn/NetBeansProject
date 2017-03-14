/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hu.codeanalyzer.nikkybruijn;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Tools",
        id = "nl.hu.codeanalyzer.nikkybruijn.OJCodeGeneratorAction"
)
@ActionRegistration(
        displayName = "#CTL_OJCodeGeneratorAction"
)
@ActionReference(path = "Menu/Tools", position = 0)
@Messages("CTL_OJCodeGeneratorAction=Oracle JET Code Generator")
public final class OJCodeGeneratorAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
