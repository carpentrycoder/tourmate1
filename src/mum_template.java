/*
 * Copyright (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mum_template{
    public static void main(String[] args) {
        PlaceTemplateFunc.PlaceTemplateFunc("Mumbai","Dash_Icons/queens-necklace.png","Dash_Icons/gate-of-india.png","Dash_Icons/info-mum.png","Dash_Icons/vadapav.png","Dash_Icons/mum-client1.png","Dash_Icons/mum-client2.png","Dash_Icons/mum-client3.png");
        PlaceTemplateFunc.getaskme().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("sutar");
            }
        });
    }
}
