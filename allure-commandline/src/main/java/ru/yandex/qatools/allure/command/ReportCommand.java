package ru.yandex.qatools.allure.command;

import io.airlift.command.Option;
import io.airlift.command.OptionType;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Artem Eroshenko <eroshenkoam@yandex-team.ru>
 */
public abstract class ReportCommand extends AbstractCommand {

    @Option(name = {"-o", "--report-dir", "--output"}, type = OptionType.COMMAND,
            description = "The directory to generate Allure report into.")
    protected String reportDirectory = "allure-report";

    /**
     * The string representation of path to the report directory.
     */
    protected String getReportDirectory() {
        return reportDirectory;
    }

    /**
     * The path to the report directory {@link #getReportDirectory()}.
     */
    protected Path getReportDirectoryPath() {
        return Paths.get(getReportDirectory());
    }
}
