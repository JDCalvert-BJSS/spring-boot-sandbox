package model;

import java.util.Objects;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Response {
    private final String responseCode;

    @JsonCreator
    public Response(
            @JsonProperty("responseCode") final String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseCode() {
        return responseCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseCode);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Response)) {
            return false;
        }

        Response other = (Response) obj;
        return new EqualsBuilder()
                .append(this.responseCode, other.responseCode)
                .build();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("responseCode", this.responseCode)
                .build();
    }
}
