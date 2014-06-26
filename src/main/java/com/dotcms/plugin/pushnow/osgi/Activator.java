package com.dotcms.plugin.pushnow.osgi;

import org.osgi.framework.BundleContext;

import com.dotcms.plugin.pushnow.actionlet.PushnowActionlet;
import com.dotmarketing.osgi.GenericBundleActivator;


public class Activator extends GenericBundleActivator {





    @SuppressWarnings ("unchecked")
    public void start ( BundleContext context ) throws Exception {

        //Initializing services...
        initializeServices( context );



        //Registering the test Actionlet
        registerActionlet( context, new PushnowActionlet() );
    }


    public void stop ( BundleContext context ) throws Exception {


        
        unregisterActionlets();

    }

}