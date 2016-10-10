package com.ruleoftech.markdown.page.generator.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.buildobjects.doctest.Docufier;

import java.io.IOException;

/**
 * Docufies the annotated tests in the input folder.
 */
@Mojo(name = "docufy")
public class DocufierMojo extends AbstractMojo {

	@Parameter(property = "docufier.inputDirectory", defaultValue = "${project.basedir}/src/test/java/")
	private String inputDirectory;

	@Parameter(property = "docufier.outputDirectory", defaultValue = "${project.build.directory}/target/doc")
	private String outputDirectory;

	/**
	 * Execute docufication.
	 *
	 */
	@Override
	public void execute() throws MojoExecutionException {

		getLog().info("Running the docufier");

        try {
            new Docufier(inputDirectory, outputDirectory);
        } catch (IOException e) {
            throw new RuntimeException("Problems docufying.", e);
        }

	}

    public String getInputDirectory() {
        return inputDirectory;
    }

    public String getOutputDirectory() {
        return outputDirectory;
    }
}
