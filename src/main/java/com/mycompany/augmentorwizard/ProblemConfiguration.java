/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.augmentorwizard;

import java.util.Hashtable;

/**
 *
 * @author joheras
 */
public class ProblemConfiguration {
    
    String problem;
    String annotationMode;
    String outputMode;
    String generationMode;
    String inputFolder;
    Hashtable<String,String> parameters = new Hashtable<>();

    public ProblemConfiguration() {
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getAnnotationMode() {
        return annotationMode;
    }

    public void setAnnotationMode(String annotationMode) {
        this.annotationMode = annotationMode;
    }

    public String getOutputMode() {
        return outputMode;
    }

    public void setOutputMode(String outputMode) {
        this.outputMode = outputMode;
    }

    public String getGenerationMode() {
        return generationMode;
    }

    public void setGenerationMode(String generationMode) {
        this.generationMode = generationMode;
    }

    public String getInputFolder() {
        return inputFolder;
    }

    public void setInputFolder(String inputFolder) {
        this.inputFolder = inputFolder;
    }
    
    public void addParameter(String parameter, String value){
        this.parameters.put(parameter, value);
    }
    
    public Hashtable<String,String> getParameters(){
        return this.parameters;
    }
    
    public void clearParameters(){
        this.parameters.clear();
    }

    @Override
    public String toString() {
        return "ProblemConfiguration{" + "problem=" + problem + ",\n annotationMode=" + annotationMode + ",\n outputMode=" + outputMode + ",\n generationMode=" + generationMode + ",\n inputFolder=" + inputFolder + ",\n parameters=" + parameters + '}';
    }
    
    
    
    
}
