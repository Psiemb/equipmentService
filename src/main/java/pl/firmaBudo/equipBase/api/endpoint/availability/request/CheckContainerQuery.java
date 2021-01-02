package pl.firmaBudo.equipBase.api.endpoint.availability.request;

import java.util.Objects;

public class CheckContainerQuery {

    private CheckContainerType checkBy;
    private String value;

    public CheckContainerType getCheckBy() {
        return checkBy;
    }

    public CheckContainerQuery setCheckBy(CheckContainerType checkBy) {
        this.checkBy = checkBy;
        return this;
    }

    public String getValue() {
        return value;
    }

    public CheckContainerQuery setValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CheckContainerQuery that = (CheckContainerQuery) o;
        return checkBy == that.checkBy && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkBy, value);
    }

    @Override
    public String toString() {
        return "CheckContainerQuery{" +
                "checkBy=" + checkBy +
                ", value='" + value + '\'' +
                '}';
    }
}
